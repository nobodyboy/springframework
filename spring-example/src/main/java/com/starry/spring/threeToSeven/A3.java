package com.starry.spring.threeToSeven;

import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;

/**
 * @author shaoyongxing
 * @date 15.5.22 9:03 上午
 **/
@Order(3)
@Component
public class A3 implements A, PriorityOrdered {
	public A3() {
		System.out.println("construct A3...");
	}

	@Override
	public void test() {
		System.out.println("test method A3...");
	}

	@Override
	public int getOrder() {
		return 3;
	}
}
