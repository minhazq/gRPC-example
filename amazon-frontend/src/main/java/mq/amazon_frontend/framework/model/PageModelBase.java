package mq.amazon_frontend.framework.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageModelBase {

	protected WebDriver driver;

	public PageModelBase(WebDriver wd) {
		PageFactory.initElements(wd, this);
	}
}
