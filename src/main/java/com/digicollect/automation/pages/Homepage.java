package com.digicollect.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.digicollect.automation.base.Base;

public class Homepage {
	
	public Homepage(){
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	public static WebElement dashboardmenu;

}
