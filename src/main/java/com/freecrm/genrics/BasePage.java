package com.freecrm.genrics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	public static WebDriver driver;

	@BeforeMethod
	public void setUp(String browser) {
		if (!browser.equals("ff")) {

			System.setProperty("webdriver.gecko.driver",
					"F:\\Practise\\Selenium\\com.freecrm.test\\src\\main\\resources\\exefiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (!browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\Practise\\Selenium\\com.freecrm.test\\src\\main\\resources\\exefiles\\geckodriver.exe");
		driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://freecrm.com/");

	}

	@AfterMethod

	public void tearDown()

	{
         driver.close();
	}

}
