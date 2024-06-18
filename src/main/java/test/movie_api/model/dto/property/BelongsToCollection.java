package test.movie_api.model.dto.property;

import com.fasterxml.jackson.annotation.JsonProperty;

public record BelongsToCollection(
		int id, 
		String name, 
		@JsonProperty("poster_path") String posterPath,
		@JsonProperty("backdrop_path") String backdropPath) {

}
