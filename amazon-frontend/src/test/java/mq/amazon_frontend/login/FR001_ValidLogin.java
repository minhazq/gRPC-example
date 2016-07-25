package mq.amazon_frontend.login;

import org.testng.annotations.Test;

import mq.amazon_frontend.framework.Scriptbase;

public class FR001_ValidLogin extends Scriptbase{

	@Test
	public void validLoginTest(){
		
		amazon().homePage().clickLogin().enterEmail("test");
		
		System.out.println("Valid login is testing..");
	}
}
