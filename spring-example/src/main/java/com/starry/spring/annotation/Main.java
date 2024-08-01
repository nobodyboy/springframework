package com.starry.spring.annotation;

import com.starry.spring.config.StarryConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shaoyongxing
 * @date 14.1.22 2:49 下午
 **/
public class Main {
	public static void main(String[] args) {

		ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(StarryConfig.class);


	}
}
