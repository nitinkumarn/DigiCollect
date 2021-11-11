package com.digicollect.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.digicollect.automation.base.Base;

public class Siginpage {
	
	
	public Siginpage(){
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(name="userid")
	public static WebElement emailfield;
	
	@FindBy(xpath ="//input[@name='password']")
	public static WebElement passwordfield;
	
	@FindBy(xpath ="//button[contains(text(),'Sign In')]")
	public static WebElement signinbutton;
	
	@FindBy(xpath = "//p[contains(text(),'Please Enter Email Address/Phone Number and Password')]")
	public static WebElement errormessage;
	

}
