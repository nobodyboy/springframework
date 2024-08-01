package com.starry.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author shaoyongxing
 * @date 2.3.22 9:06 上午
 **/
@Component
public class Father {

	//@Autowired
	Person la;

	@Resource
	Person li;

}
