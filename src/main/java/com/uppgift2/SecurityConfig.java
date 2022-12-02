package com.uppgift2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)
            throws Exception
    {
        return http
                .oauth2Login()
                .and()
                .authorizeRequests()
                .antMatchers("/user")
                .authenticated()
                .antMatchers("/**")
                .permitAll()
                .and()
                .build();
    }

}
