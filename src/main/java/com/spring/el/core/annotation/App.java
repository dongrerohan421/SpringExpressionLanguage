package com.spring.el.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"com/spring/annotation/springELAnnotation.xml");

			Customer obj = (Customer) context.getBean("customerBean");
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
