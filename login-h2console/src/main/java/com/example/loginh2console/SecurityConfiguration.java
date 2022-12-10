package com.example.loginh2console;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfiguration {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        .authorizeHttpRequests(authorizeRequests -> authorizeRequests
            .antMatchers("/h2-console/**").authenticated()
            .anyRequest().authenticated()
        )
        .formLogin(formLogin -> formLogin
            .permitAll()
        )
        .csrf(csrf -> csrf
//            .ignoringAntMatchers("/h2-console/**")
            .disable()
        )
        .headers(headers -> headers
            .frameOptions().sameOrigin()
        )
        ;
        return http.build();
    }
    
    @Bean   
    public JdbcUserDetailsManager userDetailsService(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }

}
