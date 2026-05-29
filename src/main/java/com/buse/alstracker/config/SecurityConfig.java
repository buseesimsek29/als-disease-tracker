package com.buse.alstracker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/symptoms/**", "/api/patients/**").authenticated() // API'lere giriş şartı
                        .anyRequest().permitAll() // HTML sayfaları serbest
                )
                .httpBasic(Customizer.withDefaults()); // Tarayıcıdan giriş paneli

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails doctor = User.builder()
                .username("doctor")
                .password("{noop}1234") // {noop} şifreleme kullanmadığımız için şart
                .roles("DOCTOR")
                .build();

        return new InMemoryUserDetailsManager(doctor);
    }
}