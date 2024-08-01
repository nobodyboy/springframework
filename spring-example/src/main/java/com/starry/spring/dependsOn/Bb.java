package com.starry.spring.dependsOn;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author shaoyongxing
 * @date 16.5.22 11:31 下午
 **/
@Component
public class Bb {

	static {
		System.out.println("Bb static....");
	}

	@PostConstruct
	public void initMethod() {
		System.out.println("Bb initMethod....");
	}
}
