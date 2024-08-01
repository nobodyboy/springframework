package com.starry.spring.lookUp;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author shaoyongxing
 * @date 16.5.22 11:02 下午
 **/
@Component
public abstract class Lc {

	public void printInfo() {
		La la = createLa();
		System.out.println("la1 = " + la.toString());
		La la1 = createLa();
		System.out.println("la1 = " + la1);
	}

	@Lookup
	protected abstract La createLa();
}
