package com.dubbo.provider.service.impl;

import com.UserService;

public class UserServiceTwoImpl implements UserService{

	public String sayHello(String param) {
		return "UserServiceTwoImpl: hello "+param;
	}

}
