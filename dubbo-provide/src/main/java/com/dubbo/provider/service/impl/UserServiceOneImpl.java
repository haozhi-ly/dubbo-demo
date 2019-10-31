package com.dubbo.provider.service.impl;

import com.UserService;

public class UserServiceOneImpl implements UserService{

	public String sayHello(String param) {
		return "UserServiceOneImpl : hello "+param;
	}

}
