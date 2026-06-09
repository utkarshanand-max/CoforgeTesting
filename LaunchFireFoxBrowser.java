package com.SeleniumTestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchFireFoxBrowser {
	@Test(priority=0)
	public void FireFoxBrowser() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
	}
	
	@Test(priority=1)
	public void FireFoxBrowser1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@Test(priority=2)
	public void FireFoxBrowser2() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@Test(priority=3)
	public void FireFoxBrowser3() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://altoro.testfire.net/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@Test(priority=4)
	public void FireFoxBrowser4() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@Test(priority=5)
	public void FireFoxBrowser5() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.chase.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@Test(priority=6)
	public void FireFoxBrowser6() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpratice.blogspot.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@Test(priority=7)
	public void FireFoxBrowser7() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/pratice-test-login/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@Test(priority=8)
	public void FireFoxBrowser8() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}
