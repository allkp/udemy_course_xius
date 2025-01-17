package com.example.rest.security;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity https) throws Exception {
		
		// All requests should be authenticated
		https.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated()
				);
		
		// If a request is not authenticated, a web page is shown
		https.httpBasic(withDefaults());

        // CSRF ===> /post, /put
        https.csrf(csrf -> csrf.disable());
		
		return https.build();
	}
	
}
