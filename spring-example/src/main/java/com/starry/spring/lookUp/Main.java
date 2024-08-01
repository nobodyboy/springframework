package com.starry.spring.lookUp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shaoyongxing
 * @date 16.5.22 11:14 下午
 **/
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("com.starry.spring.lookUp");
		applicationContext.refresh();
		Lb lb = applicationContext.getBean(Lb.class);
		lb.printInfo();

		Lc lc = applicationContext.getBean(Lc.class);
		lc.printInfo();
	}
}
