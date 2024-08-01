package com.starry.spring.threeToSeven;

import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author shaoyongxing
 * @date 15.5.22 9:01 上午
 **/
@Order(2)
@Component
public class A1 implements A, PriorityOrdered {
	public A1() {
		System.out.println("construct A1...");
	}

	@Override
	public void test() {
		System.out.println("test method A1...");
	}

	@Override
	public int getOrder() {
		return 2;
	}
}
