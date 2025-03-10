package com.starry.spring.annotation.beanFactoryPp;

import com.starry.spring.annotation.clazz.C;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author shaoyongxing
 * @date 11.3.23 8:45 下午
 *
 **/
//@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition a = (AbstractBeanDefinition) beanFactory.getBeanDefinition("a");
		a.setBeanClass(C.class);
	}
}
