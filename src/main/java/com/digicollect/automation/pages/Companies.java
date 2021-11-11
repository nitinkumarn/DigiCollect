package com.digicollect.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.digicollect.automation.base.Base;

public class Companies {
	
	
	
	public Companies(){
		PageFactory.initElements(Base.driver, this);
	}
	

	@FindBy(xpath="//span[contains(text(),'Companies')]")
	public static WebElement Companiesmodule;
	
	@FindBy(linkText="+ Create New")
	public static WebElement Createnewbutton;
	
	@FindBy(name="company_name")
	public static WebElement companyname;
	
	@FindBy(xpath="//div[@name=\"company_domain\"]/input")
	public static WebElement domainname;
	
	@FindBy(xpath="//span[contains(text(),'Select Industry Type')]")
	public static WebElement industrytype;
	
	
	@FindBy(xpath="//span[contains(text(),'Finance and Insurance')]")
	public static WebElement industrytypeFinanceandInsurance;
	
	
	@FindBy(name="tax_id")
	public static WebElement taxid;
	
	
	@FindBy(xpath="//span[contains(text(),'Select Currency')]")
	public static WebElement currency;
	
	@FindBy(xpath="//span[contains(text(),'INR(₹)')]")
	public static WebElement currencyINR;
	
	@FindBy(name="branch_name0")
	public static WebElement branchname;
	
	@FindBy(name="branch_department0")
	public static WebElement branchdepartmentname;
	
	@FindBy(xpath="//span[contains(text(),'Select Country')]")
	public static WebElement branchaddresscountry;
	
	
	@FindBy(xpath="(//span[contains(text(),'INDIA')])[2]")
	public static WebElement branchaddresscountryIndia;	
	
	
	@FindBy(name="admin_name")
	public static WebElement adminname;
	
	@FindBy(name="admin_email")
	public static WebElement adminemail;
	
	
	@FindBy(xpath="(//input[@placeholder='Select Domain Name'] )[2]")		
	public static WebElement selectdomainname;
	
	
	@FindBy(xpath="(//span[contains(text(),' TestDomain.com')])[2]")		
	public static WebElement selectdomainnameTestdomain;
	
	
	
	@FindBy(xpath="//input[@placeholder='Select Branch Name']")		
	public static WebElement selectbranchname;
	
	
	@FindBy(xpath="//input[@placeholder='Select Department']")		
	public static WebElement selectdepartmentname;
	
	@FindBy(name="admin_password")
	public static WebElement adminpassword;
	
	@FindBy(xpath="//button[contains(text(),'SAVE')]")
	public static WebElement savebutton;
	
	@FindBy(id="swal2-title")
	public static WebElement successtitle;
	
	
	
}
