package mq.amazon_frontend.framework.controller;
import mq.amazon_frontend.framework.model.SignInPageModel;

public class SignInPageController extends ControllerBase{

	
	public SignInPageController(SignInPageModel pmb) {
		super(pmb);
	}

	public void enterEmail(String email){
		System.out.println("enter email");
	}
}
