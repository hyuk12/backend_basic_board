package com.board.basic.board.global.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class WebConfiguration {
	// security 설정
	// db 접근 설정
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			.csrf(AbstractHttpConfigurer::disable)
			.formLogin(Customizer.withDefaults())
			.authorizeHttpRequests(authorizeRequest ->
				authorizeRequest
					.requestMatchers(
						AntPathRequestMatcher.antMatcher("/swagger-ui/**/**"),
						AntPathRequestMatcher.antMatcher("/basic/**"),
						AntPathRequestMatcher.antMatcher("/api/v1/**"),
						AntPathRequestMatcher.antMatcher("/v3/api-docs/**/**")
					).permitAll()
			)
			.headers(
				headersConfigurer ->
					headersConfigurer
						.frameOptions(
							HeadersConfigurer.FrameOptionsConfig::sameOrigin
						)
			);

		return http.build();
	}

	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		return (web ->
			web
				.ignoring()
				.requestMatchers(
					PathRequest.toStaticResources().atCommonLocations()
				)
		);
	}
}
