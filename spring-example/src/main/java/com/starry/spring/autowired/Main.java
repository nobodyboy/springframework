package com.starry.spring.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shaoyongxing
 * @date 2.3.22 8:59 上午
 **/
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("com.starry.spring.autowired");
		applicationContext.refresh();

		Father bean = applicationContext.getBean(Father.class);
		System.out.println(bean);
	}
}
