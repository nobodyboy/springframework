package com.starry.spring.annotation.beanDefinitionRegistry;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.stereotype.Component;

/**
 * @author shaoyongxing
 * @date 11.3.23 9:00 下午
 **/
@Component
public class TestBeanDefinitionRegistry implements BeanDefinitionRegistry {

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeanDefinitionStoreException {
		String beanClassName = beanDefinition.getBeanClassName();
		System.out.println("testBeanDefinitionRegistry -- registerBeanDefinition --beanClassName: " + beanClassName);
	}

    @Override
    public void removeBeanDefinition(String beanName) throws NoSuchBeanDefinitionException {

    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws NoSuchBeanDefinitionException {
        return null;
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return false;
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return new String[0];
    }

    @Override
    public int getBeanDefinitionCount() {
        return 0;
    }

    @Override
    public boolean isBeanNameInUse(String beanName) {
        return false;
    }

    @Override
    public void registerAlias(String name, String alias) {

    }

    @Override
    public void removeAlias(String alias) {

    }

    @Override
    public boolean isAlias(String name) {
        return false;
    }

    @Override
    public String[] getAliases(String name) {
        return new String[0];
    }
}
