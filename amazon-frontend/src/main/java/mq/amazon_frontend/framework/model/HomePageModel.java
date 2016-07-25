package mq.amazon_frontend.framework.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageModel extends PageModelBase{

	
	public HomePageModel(WebDriver wd) {
		super(wd);
		PageFactory.initElements(wd, this);
	}
	
	
	@FindBy(id="nav-link-yourAccount")
	public WebElement loginButton;

}
