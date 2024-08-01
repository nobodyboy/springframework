package com.starry.spring.threeToSeven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author shaoyongxing
 * @date 15.5.22 9:06 上午
 **/
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("com.starry.spring.threeToSeven");
		applicationContext.refresh();

		B bean = applicationContext.getBean(B.class);
		List<A> aList = bean.getAList();
		for (A a : aList) {
			a.test();
		}
	}
}
