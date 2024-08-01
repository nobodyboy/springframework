package com.starry.spring.annotation.clazz;

import org.springframework.stereotype.Component;

/**
 * @author shaoyongxing
 * @date 11.3.23 8:34 下午
 **/
@Component("a")
public class A {

	private String name;

	public A () {
		System.out.print("a construct....");
	}
}
