package com.testfind;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages.Dashboardpage;
import com.pages.LoginPage;

public class DashboardTest extends BaseTest {
    LoginPage objLogin;
    Dashboardpage objDashboardpage;

    @Test(priority = 0)
    public void dashBoardTest() {
        objLogin = new LoginPage(driver);
        objLogin.login("Admin", "admin123");

        objDashboardpage = new Dashboardpage(driver);
        String actualText = objDashboardpage.getHomePagetext();  
        Assert.assertEquals(actualText, "Dashboard");
    }
}