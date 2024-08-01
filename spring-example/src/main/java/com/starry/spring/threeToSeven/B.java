package com.starry.spring.threeToSeven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author shaoyongxing
 * @date 15.5.22 10:32 上午
 **/
@Component
public class B {

	@Autowired
	List<A> aList;

	public List<A> getAList() {
		return aList;
	}
}
