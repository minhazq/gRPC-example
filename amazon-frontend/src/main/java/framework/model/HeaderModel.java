package framework.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import framework.TestScriptBase;


public class HeaderModel {

	
	public WebElement signInLink(){
/*		if(TestScriptBase.driver==null){
			System.out.println("Driveris null");
		}else if(TestScriptBase.driver!=null){
			System.out.println("Driver is NOT null");
		}*/
		//TestScriptBase.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement link =  TestScriptBase.driver.findElement(By.id("nav-link-yourAccount"));
		
		//nav-your-amazon
		/*if(link==null){
			System.out.println("Link is  null");
		}else if(link!=null){
			System.out.println("Link is NOT null");
		}*/
		return link;
	}
	
}
