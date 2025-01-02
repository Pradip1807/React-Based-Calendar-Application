package com.entnt.calendar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable() // Disable CSRF for testing purposes
                .authorizeHttpRequests()
                .requestMatchers("/api/public/**").permitAll()  // Allow all requests under /api/public
                .requestMatchers("/api/companies/**").permitAll() // Allow unrestricted access to company endpoints
                .anyRequest().authenticated(); // Require authentication for any other requests
        return http.build();
    }
}
