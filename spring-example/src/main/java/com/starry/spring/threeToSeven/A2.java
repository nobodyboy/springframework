package com.starry.spring.threeToSeven;

import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author shaoyongxing
 * @date 15.5.22 9:02 上午
 **/
@Order(1)
@Component
public class A2 implements A, PriorityOrdered {
	public A2() {
		System.out.println("construct A2...");
	}

	@Override
	public void test() {
		System.out.println("test method A2...");
	}

	@Override
	public int getOrder() {
		return 1;
	}
}
