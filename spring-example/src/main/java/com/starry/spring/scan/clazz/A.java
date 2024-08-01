package com.starry.spring.scan.clazz;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @author shaoyongxing
 * @date 23.5.23 9:59 下午
 **/
@Component
public class A {

	public A() {
		System.out.println("a init");
	}
}
