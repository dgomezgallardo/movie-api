package test.movie_api.service;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import test.movie_api.model.dto.MovieDetailsDto;
import test.movie_api.model.dto.MovieDto;
import test.movie_api.model.response.MovieDtoSearchResponse;

@Service
public class MovieFromTmdbService {
	@Value("${tmdb.api.key}")
    private String apiKey;
	@Value("${tmdb.api.bearertoken}")
    private String bearerToken;
	@Value("${tmdb.api.host}")
    private String host;
	
	WebClient webClient;
	
	public MovieFromTmdbService(WebClient.Builder webClientBuilder) {
		this.webClient = webClientBuilder.build();
	}
	
	public List<MovieDto> searchMovieByName(String name){
    			
		MovieDtoSearchResponse moviesSearchResponse = this.webClient.get()
				.uri(uriBuilder -> uriBuilder
    					.scheme("https")
    					.host(host)
    					.port(443)
    					.path("/3/search/movie")
    					.queryParam("api_key", apiKey)
    					.queryParam("query", name)
    					.build())
    			.accept(MediaType.APPLICATION_JSON)
    			.header("Authotization", "Bearer " + bearerToken)
    			.retrieve()
    			.bodyToMono(MovieDtoSearchResponse.class)
    			.block();
		
		if (moviesSearchResponse != null) {
	        List<MovieDto> results = moviesSearchResponse.getResults();
	        if (results != null) {
	            return results;
	        }
	    }

	    return Collections.emptyList();
    }
	
    public MovieDetailsDto searchMovieDetails(String id) {
        
        return this.webClient.get()
    			.uri(uriBuilder -> uriBuilder
    					.scheme("https")
    					.host(host)
    					.port(443)
    					.path("/3/movie")
    					.path("/" + id)
    					.queryParam("api_key", apiKey)
    					.build())
    			.accept(MediaType.APPLICATION_JSON)
    			.header("Authotization", "Bearer " + bearerToken)
    			.retrieve()
    			.bodyToMono(MovieDetailsDto.class)
    			.block();
    }
}
