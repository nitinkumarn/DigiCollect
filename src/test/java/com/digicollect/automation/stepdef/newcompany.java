package com.digicollect.automation.stepdef;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.digicollect.automation.framework.Elements;
import com.digicollect.automation.pages.Companies;

import cucumber.api.java.en.*;


public class newcompany {
	
	public static Logger log = Logger.getLogger(newcompany.class);
	Companies companies = new Companies();
	

	
	
	@And("^I click on comapnies module and create a new comapny$")
	public void i_click_on_comapnies_module_and_create_a_new_comapny() {
		
		Elements.click(Companies.Companiesmodule);
		Elements.click(Companies.Createnewbutton);
		log.info("User clicked on comapnies module and create a new comapny");
	    
	}

	@And("^I provide Company name as \"([^\"]*)\"$")
	public void i_provide_Company_name_as(String companyname) {
		
		Elements.TypeText(Companies.companyname, System.currentTimeMillis()+ companyname);
		log.info("User provided company name");
	}

	@And("^I provide Domain name as \"([^\"]*)\"$")
	public void i_provide_Domain_name_as(String domainname)  {
		
	   Elements.TypeText(Companies.domainname, System.currentTimeMillis()+domainname);
	   log.info("User provided domain name");
	}

	@And("^I provide Industry type as \"([^\"]*)\"$")
	public void i_provide_Industry_type_as(String industrytype) {
		
		
		Elements.click(Companies.industrytype);
	    Elements.click(Companies.industrytypeFinanceandInsurance);
	    log.info("User provided Industry type");
	}

	@And("^I provide Taxid as \"([^\"]*)\"$")
	public void i_provide_Taxid_as(String taxid) {
		
		Elements.TypeText(Companies.taxid, System.currentTimeMillis()+ taxid);
	    log.info("User provided Taxid");
	}

	@And("^I select currency as \"([^\"]*)\"$")
	public void i_select_currency_as(String arg1){
		
		Elements.click(Companies.currency);
		Elements.click(Companies.currencyINR);
	   log.info("User provided currency");
	}

	@And("^I provide branch name as \"([^\"]*)\"$")
	public void i_provide_branch_name_as(String branchname) {
		
		Elements.TypeText(Companies.branchname, System.currentTimeMillis()+branchname);
	    log.info("User provided branchname");
	}

	@And("^I provide department name as \"([^\"]*)\"$")
	public void i_provide_department_name_as(String branchdepartmentname){
		
		Elements.TypeText(Companies.branchdepartmentname, System.currentTimeMillis()+branchdepartmentname);
	    log.info("User provided department name");
	}

	@And("^I select branch address county as \"([^\"]*)\"$")
	public void i_select_branch_address_county_as(String arg1){
		
		
		Elements.click(Companies.branchaddresscountry);
		Elements.click(Companies.branchaddresscountryIndia);
		
		log.info("User selected branch address county");
	    
	}

	@And("^I enter Admin name as \"([^\"]*)\"$")
	public void i_enter_Admin_name_as(String adminname) {
		
	   Elements.TypeText(Companies.adminname, System.currentTimeMillis()+adminname);
	   
	   log.info("User provided Adminname");
	}

	@And("^I enter admin email as \"([^\"]*)\"$")
	public void i_enter_admin_email_as(String adminemail) throws InterruptedException {
		
		
	    Elements.TypeText(Companies.adminemail, System.currentTimeMillis()+adminemail);
	    Elements.click(Companies.domainname);
	    Thread.sleep(5000);
	    //Elements.click(Companies.selectdomainnameTestdomain);
	    Companies.domainname.sendKeys(Keys.ENTER);
	    log.info("User entered Adminemail");
	}

	@And("^I enter admin branch name as \"([^\"]*)\"$")
	public void i_enter_admin_branch_name_as(String arg1) {
		
		
		
	    Elements.click(Companies.selectbranchname);
	    Companies.selectbranchname.sendKeys(Keys.ENTER);
	    
	    log.info("User entered admin branch name");
	}

	@And("^I enter admin department as \"([^\"]*)\"$")
	public void i_enter_admin_department_as(String arg1)  {
		
	    Elements.click(Companies.selectdepartmentname);
	    Companies.selectdepartmentname.sendKeys(Keys.ENTER);
	    log.info("User entered admin department");
	}

	@And("^I enter admin password as \"([^\"]*)\"$")
	public void i_enter_admin_password_as(String adminpassword) {
		
		
		Elements.TypeText(Companies.adminpassword, adminpassword);
	    log.info("User entered admin password");
	}
	
	@And("^I click on save button$")
	public void i_click_on_save_button() throws InterruptedException{
		
		
		Thread.sleep(5000);
	    Elements.click(Companies.savebutton);
	    Thread.sleep(5000);
	    
	    log.info("Clicked on save button");
	}
	
	@Then("^New company shopuld be created$")
	public void new_company_shopuld_be_created(){
		
		Assert.assertTrue(Elements.isDisplayed(Companies.successtitle));
		log.info("NewCompanycreated successfully");
	}

}
