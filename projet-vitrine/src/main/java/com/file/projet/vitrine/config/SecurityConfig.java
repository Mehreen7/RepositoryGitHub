package com.file.projet.vitrine.config;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private DataSource dataSource;
	@Autowired
	public void configureGlobal (AuthenticationManagerBuilder authenticationMgr) throws Exception{
		authenticationMgr
		.jdbcAuthentication()
		.withDefaultSchema()
		.dataSource(dataSource)
		.passwordEncoder(new BCryptPasswordEncoder());
	
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		
	http
	.authorizeRequests()
	.antMatchers("/protectedByUserRole*").hasRole("PARTIEL")
	.antMatchers("/protectedByAdminRole*").hasRole("TOTAL")
	.antMatchers("/","notprotected").permitAll()
	.and()
	.httpBasic();
	}

}