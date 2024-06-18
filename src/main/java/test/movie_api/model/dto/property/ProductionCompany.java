package test.movie_api.model.dto.property;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ProductionCompany(
		int id,
	    @JsonProperty("logo_path") String logoPath,
	    String name,
	    @JsonProperty("origin_country") String originCountry) {

}
