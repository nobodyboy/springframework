package com.starry.spring.threeToTwo.defaults;

import org.springframework.stereotype.Component;

/**
 * @author shaoyongxing
 * @date 24.4.22 11:31 下午
 **/
@Component("aa")
public class A {

	public A() {
		System.out.println("default constructor");
	}

	public A(B b) {
		System.out.println("constructor for b");
	}

	public A(C c) {
		System.out.println("constructor for c");
	}
}
