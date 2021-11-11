package com.digicollect.automation.stepdef;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	public static ExtentReports getInstance() {
		Date date = new Date();
		String FileNameType = date.toString().replace(" ", "_").replace(":", "_")+".html";
		
		String reportFileType = "reports//"+ FileNameType;
		
		ExtentReports eReport = new ExtentReports(reportFileType, true, DisplayOrder.NEWEST_FIRST);
		
		File reportConfigFile = new File("ReportsConfig.xml");
		
		eReport.loadConfig(reportConfigFile);
		
		eReport.addSystemInfo("Cucumber Junit version", "1.2.5")
		.addSystemInfo("WebDriver Version", "3.141.59")
		.addSystemInfo("Environment", "Staging Environment")
		.addSystemInfo("Executed By", "Nitinkumar N");
		
		return eReport;
	}

}
