package com.lashko.blackjack;

import java.util.Properties;

import javax.sql.DataSource;

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
public class ApplicationStart extends SpringBootServletInitializer{
	// need to pass correct properties
	@Bean
	LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setPackagesToScan("com.lashko.blackjack.entity");
		Properties props = new Properties();
		props.put("dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		props.put("show_sql", true);
		props.put("hbm2ddl.auto", "update");
		bean.setHibernateProperties(props);
		return bean;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager(
			SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		return transactionManager;
	}
	
	public static void main(final String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
        System.out.println("It's ALIVE!!!");
    }

    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(ApplicationStart.class);
    }
}
