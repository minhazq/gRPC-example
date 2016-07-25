package mq.amazon_frontend.framework.controller;

import mq.amazon_frontend.framework.model.HomePageModel;
import mq.amazon_frontend.framework.model.PageModelBase;
import mq.amazon_frontend.framework.model.SignInPageModel;

public class HomePageController extends ControllerBase{

	private SignInPageModel siginInPageModel ; 
	
	public HomePageController(HomePageModel pmb) {
		super(pmb);
		siginInPageModel = new SignInPageModel(wd)
	}

	public SignInPageController clickLogin(){
		System.out.println("click login");
		
		return new SignInPageController(SignInPageModel pmb);	
	}
	
	
}
