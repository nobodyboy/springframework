package com.starry.spring.ioc.service.impl;

import com.starry.spring.ioc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author shaoyongxing
 * @date 7.1.22 9:35 上午
 **/
@Service
public class UserServiceImpl implements UserService {
	@Override
	public String queryNameById(long id) {
		return "starry";
	}
}
