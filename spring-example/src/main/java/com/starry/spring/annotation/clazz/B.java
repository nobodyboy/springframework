package com.starry.spring.annotation.clazz;

import org.springframework.stereotype.Component;

/**
 * @author shaoyongxing
 * @date 11.3.23 8:34 下午
 **/
@Component("b")
public class B {

	public B() {
		System.out.println("b construct....");
	}
}
