package test.movie_api.model.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import test.movie_api.model.dto.property.BelongsToCollection;
import test.movie_api.model.dto.property.Genre;
import test.movie_api.model.dto.property.ProductionCompany;
import test.movie_api.model.dto.property.ProductionCountry;
import test.movie_api.model.dto.property.SpokenLanguage;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieDetailsDto {
	
	    private boolean adult;
	    @JsonProperty("backdrop_path")
	    private String backdropPath;
	    @JsonProperty("belongs_to_collection")
	    private ArrayList<BelongsToCollection> belongsToCollection;
	    private int budget;
	    private ArrayList<Genre> genres;
	    private String homepage;
	    private int id;
	    @JsonProperty("imdb_id")
	    private String imdbId;
	    @JsonProperty("origin_country")
	    private ArrayList<String> originCountry;
	    @JsonProperty("original_language")
	    private String originalLanguage;
	    @JsonProperty("original_title")
	    private String originalTitle;
	    private String overview;
	    private double popularity;
	    @JsonProperty("poster_path")
	    private String posterPath;
	    @JsonProperty("production_companies")
	    private ArrayList<ProductionCompany> productionCompanies;
	    @JsonProperty("production_countries")
	    private ArrayList<ProductionCountry> productionCountries;
	    @JsonProperty("release_date")
	    private String releaseDate;
	    private int revenue;
	    private int runtime;
	    @JsonProperty("spoken_languages")
	    private ArrayList<SpokenLanguage> spokenLanguages;
	    private String status;
	    private String tagline;
	    private String title;
	    private boolean video;
	    @JsonProperty("vote_average")
	    private double voteAverage;
	    @JsonProperty("vote_count")
	    private int voteCount;
	
}


