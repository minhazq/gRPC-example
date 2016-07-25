package framework.controller;

import org.springframework.beans.factory.annotation.Autowired;

import framework.model.HeaderModel;

public class HeaderController {

	@Autowired
	private HeaderModel headerModel = null;

	
	
	public void signIn(String usrName , String password){
		System.out.println("Sigin bla bla bla ");
		headerModel.signInLink().click();
	}
	
	
}
