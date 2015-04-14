package com.lashko.blackjack;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ApplicationStart extends SpringBootServletInitializer {

	Logger logger = Logger.getLogger(ApplicationStart.class);

	public static void main(final String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}

	@Override
	protected final SpringApplicationBuilder configure(
			final SpringApplicationBuilder application) {
		return application.sources(ApplicationStart.class);
	}

}