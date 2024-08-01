package com.starry;

import com.starry.spring.annotation.beanFactoryPp.TestBeanFactoryPostProcessor;
import com.starry.spring.annotation.clazz.A;
import com.starry.spring.config.StarryConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shaoyongxing
 * @date 11.3.23 8:13 下午
 **/
public class Test1 {

	@Test
	public void test1() {
		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StarryConfig.class);

//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//		applicationContext.register(StarryConfig.class);
//		applicationContext.getBeanFactory().registerSingleton("a", new A());
//
//		applicationContext.refresh();
//		A bean = applicationContext.getBean(A.class);
//		System.out.println(bean.toString());

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.starry.spring.annotation.clazz");
		context.refresh();

		A a = (A)context.getBean("a");

	}

	@Test
	public void test_import() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StarryConfig.class);
		TestBeanFactoryPostProcessor testPostProcessor = (TestBeanFactoryPostProcessor) context.getBean("testBeanFactoryPostProcessor");
	}
}
