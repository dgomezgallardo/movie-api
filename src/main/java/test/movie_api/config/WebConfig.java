package test.movie_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebConfig {

    @Bean
    WebClient.Builder webClBuilder(){
		return WebClient.builder();
	}
}
