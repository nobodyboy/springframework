package com.starry.spring.dependsOn;

import com.starry.spring.lookUp.Lb;
import com.starry.spring.lookUp.Lc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shaoyongxing
 * @date 16.5.22 11:14 下午
 **/
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("com.starry.spring.dependsOn");
		applicationContext.refresh();
	}
}
