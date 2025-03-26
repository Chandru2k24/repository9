package com.test_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageObject_basics2403 {
    WebDriver driver;

    @FindBy(xpath = "//*[@name='q']")
    private WebElement searchBox;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        PageFactory.initElements(driver, this);
    }

    @Test
    public void searchFor() {
        searchBox.sendKeys("text");
        searchBox.submit();
    }
}
