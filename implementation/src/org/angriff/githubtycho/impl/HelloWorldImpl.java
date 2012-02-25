package org.angriff.githubtycho.impl;

import org.angriff.githubtycho.service.HelloWorldService;

public class HelloWorldImpl implements HelloWorldService {

	@Override
	public void sayHello() {
		System.out.println("Hello world!");
	}

}
