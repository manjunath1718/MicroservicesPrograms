package com.telusko.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef="db2EntityManagerFactory", 
transactionManagerRef="db2TransactionManager", basePackages="com.telusko.repo.pd")
public class Db2Config {
	

	//DataSource
	
	@Bean
	@Primary
	@ConfigurationProperties(prefix="db2.datasource")
	public DataSource db2DataSource()
	{
		return DataSourceBuilder.create().build();
	}
	
	
	//EntityManager
	@Bean
	@Primary
	public LocalContainerEntityManagerFactoryBean db2EntityManagerFactory(EntityManagerFactoryBuilder emfb) {

		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL10Dialect");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");

		return emfb.dataSource(db2DataSource()).packages("com.telusko.model.product").properties(properties)
				.persistenceUnit("teluskodb").build();

	}
	
	//TransactionManagement
	
	@Bean
	@Primary
	public PlatformTransactionManager db2TransactionManager(
			@Qualifier("db2EntityManagerFactory")EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}

}
