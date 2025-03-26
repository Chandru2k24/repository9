package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.Dashboardpage;
import com.pages.LoginPage;

public class DashboardTest extends BaseTest {
	LoginPage objLogin;
	Dashboardpage objDashboardpage;
  @Test(priority = 1, dependsOnMethods = { "loginTest" })
  public void DashBoardtest() {
	  objLogin=new LoginPage(driver);
	  objLogin.login("Admin", "admin123");
	  objDashBoardPage=new Dashboardpage(driver);
	  Assert.assertTrue(objDashBoardPage.getHomePagetext().contains("Dashboard"));
  }
}