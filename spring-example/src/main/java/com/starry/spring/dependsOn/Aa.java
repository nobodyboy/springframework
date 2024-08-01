package com.starry.spring.dependsOn;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author shaoyongxing
 * @date 16.5.22 11:31 下午
 **/
@Component
@DependsOn("bb")
public class Aa {

	@PostConstruct
	public void initMethod() {
		System.out.println("Aa initMethod....");
	}
}
