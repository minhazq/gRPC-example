package mq.amazon_frontend.framework.controller;


public class ApplicationController {

	
	public HomePageController homePage(){
		System.out.println("HomePage");
		return new HomePageController();
	}
	
}
