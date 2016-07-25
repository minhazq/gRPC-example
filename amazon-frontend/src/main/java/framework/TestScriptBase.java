package framework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import framework.controller.ApplicationController;
import framework.controller.HeaderController;

/*
 * knowledge:
 * http://javarevisited.blogspot.com/2012/11/difference-between-setter-injection-vs-constructor-injection-spring-framework.html
 * http://spring.io/blog/2007/07/11/setter-injection-versus-constructor-injection-and-the-use-of-required/
 */

@ContextConfiguration(locations="classpath:/applicationContext.xml")
public abstract class TestScriptBase extends AbstractTestNGSpringContextTests{

	public static  WebDriver driver = null;
	private ApplicationController amazon = null;
	private HeaderController header = null;
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	
	public ApplicationController amazon(){
		 amazon = (ApplicationController) applicationContext.getBean("amazon");
		 return amazon;
	}
	
	
	public HeaderController header(){
		header = (HeaderController) applicationContext.getBean("headerPageController");
		return header;
	}
	

	@BeforeClass
	public void beforeClass(){
		driver = (WebDriver) applicationContext.getBean("firefox");
		driver.get("http://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before test bla bla bla");
		
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After Test bla bla bla ");
	}
	
	@AfterClass
	public void afterClass(){
		
		if(driver!=null && ((RemoteWebDriver)driver).getSessionId()!=null){
			driver.close();
			driver.quit();
		}
	
	}
	
	
	
	
	
}
