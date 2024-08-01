package com.starry.spring.lookUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author shaoyongxing
 * @date 16.5.22 11:02 下午
 **/
@Component
public class Lb {

	@Autowired
	private La la;

	public void printInfo() {
		System.out.println(la.toString());
		System.out.println(la.toString());
	}
}
