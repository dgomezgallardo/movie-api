package test.movie_api.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import lombok.extern.slf4j.Slf4j;
import test.movie_api.model.dto.MovieDetailsDto;
import test.movie_api.model.dto.MovieDto;


@Slf4j
@SpringBootTest
class MovieFromTmdbServiceTest {

	@Autowired
	private MovieFromTmdbService movieFromTmdbService;
	
	@Test
	void canSearchMovieByName() {
		List<MovieDto> movieList;
		String query = "king";
		movieList = movieFromTmdbService.searchMovieByName(query);
		log.warn(movieList.toString());
		
		Assert.notNull(movieList, "the class should not be null");
	}
	
	@Test
	void canSearchMovieDetails() {
		MovieDetailsDto movieDetailsDto = movieFromTmdbService.searchMovieDetails("500");
		
		assertEquals("Reservoir Dogs", movieDetailsDto.getTitle());
	}

}
