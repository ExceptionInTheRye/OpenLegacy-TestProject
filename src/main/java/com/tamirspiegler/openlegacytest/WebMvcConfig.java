package com.tamirspiegler.openlegacytest;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	private final ApplicationContext applicationContext;
	private final EntityManager entityManager;
	
	@Autowired
	public WebMvcConfig(ApplicationContext applicationContext, EntityManager entityManager) {
		this.applicationContext = applicationContext;
		this.entityManager = entityManager;		
	}
	
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		super.addArgumentResolvers(argumentResolvers);
	}

}
