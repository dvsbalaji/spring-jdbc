package com.ty.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.ty")
public class MyConfigaration {

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataaSource()) ;
	}
	
	@Bean
	public DataSource getDataaSource() {
		String url = "jdbc:mysql://localhost:3306/spring_jdbc_001" ;
		String user = "root" ;
		String password = "root" ;
		return new DriverManagerDataSource(url, user, password) ;
	}
}
