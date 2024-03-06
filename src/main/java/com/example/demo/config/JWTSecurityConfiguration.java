package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.jwtsecurity.JWTAuthenticationEntryPoint;
import com.example.demo.jwtsecurity.JWTAuthenticationFilter;

@Configuration
public class JWTSecurityConfiguration {

    @Autowired
    private JWTAuthenticationEntryPoint point;
    @Autowired
    private JWTAuthenticationFilter filter;	
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	
    	http.csrf(csrf->csrf.disable())
    		.cors(cors->cors.disable())
    		.authorizeHttpRequests(auth->
    		                             auth.requestMatchers("/auth/login").permitAll().requestMatchers("/weather/forecast","/weather/hourlyforecast").authenticated())
    		.exceptionHandling(ex->ex.authenticationEntryPoint(point))
    		.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).addFilterBefore(filter,UsernamePasswordAuthenticationFilter.class);
    	
    	return http.build();
    }
}
