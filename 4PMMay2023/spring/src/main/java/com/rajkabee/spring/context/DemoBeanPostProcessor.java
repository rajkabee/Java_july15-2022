package com.rajkabee.spring.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBeanPostProcessor implements BeanPostProcessor {
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("After bean initialization!");
		return bean;
	}
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before bean initialization!");
		return bean;
	}
}
