package com.starry.context;

import com.starry.spring.context.BBeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shaoyongxing
 * @date 12.3.23 1:55 下午
 **/
public class Test {

	@org.junit.jupiter.api.Test
	public void test_1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.starry.spring.context");
		// 提供api方法
		context.addBeanFactoryPostProcessor(new BBeanFactoryPostProcessor());
		context.refresh();

	}
}
