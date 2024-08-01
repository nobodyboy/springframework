package com.starry.spring.annotation.factorybean;

import com.starry.spring.annotation.clazz.A;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author shaoyongxing
 * @date 11.3.23 10:34 下午
 **/
//@Component
public class MyFactoryBean implements FactoryBean<A> {

	@Override
	public A getObject() throws Exception {
		return new A();
	}

	@Override
	public Class<?> getObjectType() {
		return A.class;
	}
}
