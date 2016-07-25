package mq.amazon_frontend.framework;

import org.testng.annotations.BeforeTest;

import mq.amazon_frontend.framework.controller.ApplicationController;

public abstract class Scriptbase {

	public ApplicationController amazon(){
		return new ApplicationController();
	}
	
	@BeforeTest
	public void setup(){
		System.out.println("Setup is calling");
	}
}
