package com.javabullets.springdata.jparest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import org.springframework.http.HttpMethod;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
			throws Exception {
		auth.
			inMemoryAuthentication()
				.withUser("user").password("user").roles("USER").and()
				.withUser("admin").password("admin").roles("USER","ADMIN");
	}

    @Override
    protected void configure(HttpSecurity http) throws Exception {
	    http
          .authorizeRequests()
            .antMatchers("/rest/**").hasAnyRole("ADMIN","USER").and()
          .httpBasic()
            .and()
		   .csrf().disable();		   
    }
}