package test.movie_api.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import test.movie_api.model.dto.MovieDto;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieDtoSearchResponse {
	private int page;
    private List<MovieDto> results;
    @JsonProperty("total_pages")
    private int totalPages;
    @JsonProperty("total_results")
    private int totalResults;
}
