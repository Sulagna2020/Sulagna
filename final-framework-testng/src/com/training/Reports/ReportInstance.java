package com.training.Reports;

import java.io.File;
import java.net.InetAddress;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.training.sanity.tests.LoginTests;

public class ReportInstance {

	static InetAddress ip;
	static String hostName;
	public static ExtentReports extent;

	public static void startReportInstance() {

		try
		{
			ip=InetAddress.getLocalHost();
			hostName=ip.getHostName();

			LoginTests.pathofReport=System.getProperty("user.dir")+"\\Reports\\"+"Report_"+"System.currentTimeMillis()";
			new File(LoginTests.pathofReport).mkdir();

			LoginTests.htmlReporter = new ExtentHtmlReporter(LoginTests.pathofReport+"\\Reports_"+"System.currentTimeMillis()"+".htmlReporter");
			extent=new ExtentReports();
			extent.attachReporter(LoginTests.htmlReporter);

			LoginTests.htmlReporter.config().setDocumentTitle("AutomationReport_Uniform_Medium");
			LoginTests.htmlReporter.config().setReportName("Uniform");
			LoginTests.htmlReporter.config().setTheme(Theme.STANDARD);

			extent.setSystemInfo("User hostname is", hostName);

		}


		catch(Exception e)
		{
			e.printStackTrace();

		}

	}

}
