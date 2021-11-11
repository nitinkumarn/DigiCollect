package com.digicollect.automation.stepdef;

import org.apache.log4j.Logger;
import org.junit.Assert;

import com.digicollect.automation.base.Base;
import com.digicollect.automation.framework.Elements;
import com.digicollect.automation.pages.Homepage;
import com.digicollect.automation.pages.Siginpage;


import cucumber.api.java.en.*;

public class login {
	public static Logger log = Logger.getLogger(login.class);
	Siginpage signpage = new Siginpage();
	Homepage homepage = new Homepage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		
		log.info("Application launch started");
		
		
		Base.driver.get(Base.reader.getUrl());
		
		log.info("Application launched successfully");
	}

	@When("^I login to application using emailaddress \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_login_to_application_using_emailaddress_and_password(String username, String password)  {
		

		log.info("Login to application using emailaddress and password --->started");
		Elements.TypeText(Siginpage.emailfield, username);
		Elements.TypeText(Siginpage.passwordfield, password);
		
		log.info("User logined to application using emailaddress and password successfully");
	}

	@And("^I click on signIn button$")
	public void i_click_on_signIn_button()  {
		
		Elements.click(Siginpage.signinbutton);
		log.info("User clicked on Signinbutton");
	}

	@Then("^I should see that user is able to login successfully$")
	public void i_should_see_that_user_is_able_to_login_successfully() throws InterruptedException  {
Thread.sleep(5000);

	  Assert.assertTrue( Elements.isDisplayed(Homepage.dashboardmenu));
	  
	  log.info("User is able to login successfully");
	}

	
	@Then("^I should see an error message that credentials are invalid$")
	public void i_should_see_an_error_message_that_credentials_are_invalid() throws Throwable {
		Thread.sleep(5000);
		 Assert.assertTrue(Elements.VerifyTextEquals(Siginpage.errormessage, "Please Enter Email Address/Phone Number and Password"));
		 
		 log.info("User is not able to login and error message is displayed to user");
	}

}
