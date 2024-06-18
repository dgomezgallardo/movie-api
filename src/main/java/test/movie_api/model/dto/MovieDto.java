package test.movie_api.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieDto {
	
	private int id;
	@JsonProperty("original_title")
	private String originalTitle;
	private String overview;
	private String title;
	
}
