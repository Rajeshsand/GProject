package org.pomframe;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends HelperClass{
	
	public PojoClass() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getNaviBtn() {
		return naviBtn;
	}

	public WebElement getNaviAcc() {
		return naviAcc;
	}

	public WebElement getNaviIhaveAcc() {
		return naviIhaveAcc;
	}


	@FindBy(xpath="//button[@class='global-navigation-header__button']")
	private WebElement naviBtn;
	
	@FindBy(xpath="//a[@class='global-navigation__link']")
	private WebElement naviAcc;
	
	@FindBy(xpath="//a[@class='global-navigation__link']")
	private WebElement naviIhaveAcc;
		
	
	
}


