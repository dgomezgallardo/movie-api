package test.movie_api.model.dto.property;

import com.fasterxml.jackson.annotation.JsonProperty;

public record SpokenLanguage(
		@JsonProperty("english_name") String englishName,
	    String iso_639_1,
	    String name) {

}
