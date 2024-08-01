package com.starry.scan;

import com.starry.spring.scan.ScanConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shaoyongxing
 * @date 23.5.23 10:02 下午
 **/
public class ScanTest {

	@Test
	public void test() {

		ApplicationContext context = new AnnotationConfigApplicationContext(ScanConfig.class);


	}
}
