package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {

	@Autowired
	private MyUserDetailsService UserDetailsService;

	public void configureUsers(AuthenticationManagerBuilder auth, PasswordEncoder passwordEncoder) throws Exception {
		auth.userDetailsService(UserDetailsService).passwordEncoder(passwordEncoder);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();
	}

	/*
	 * @Bean public InMemoryUserDetailsManager configureUsers() {
	 * 
	 * UserDetails adminUser = User.builder() .username("manish")
	 * .password(passwordEncoder().encode("manish123")) .authorities("ADMIN")
	 * .build();
	 * 
	 * UserDetails normalUser = User.builder() .username("prasad")
	 * .password(passwordEncoder().encode("prasad123")) .authorities("USER")
	 * .build();
	 * 
	 * return new InMemoryUserDetailsManager(adminUser,normalUser);
	 * 
	 * }
	 */

	@Bean
	public SecurityFilterChain securityConfig(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests((req) -> req.requestMatchers("/contact").permitAll().anyRequest().authenticated())
				.formLogin(Customizer.withDefaults());

		return http.build();
	}

}
