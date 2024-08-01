package com.starry.spring.threeToOne;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shaoyongxing
 * @date 24.4.22 11:17 下午
 *
 * 内部类实例化抛出异常，异常：无法找到外部类；
 * org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.starry.spring.threeToOne.H' available
 *
 * 解释：首先类在实例化的过程中会通过算法推断构造方法，如果没有推出则使用不带参数的构造方法；【org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#createBeanInstance(java.lang.String, org.springframework.beans.factory.support.RootBeanDefinition, java.lang.Object[])】
 * 其次，在JVM的角度，内部类是外部类的一个属性，属性的使用必须要找到类的bean，否则无法拿到属性；除非是静态类型的属性。
 *
 * 解决：1、把该属性变成static即可；2、提前实例化外部类；
 **/
public class H {

	class J{

	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//		applicationContext.register(H.class);
		applicationContext.register(J.class);
		applicationContext.refresh();
		applicationContext.getBean(J.class);
	}
}
