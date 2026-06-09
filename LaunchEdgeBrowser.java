package com.SeleniumTestDemo;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class LaunchEdgeBrowser {
	@Test(priority=0)
	public void EdgeBrowser() {
		WebDriver driver = new EdgeDriver();
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
	public void EdgeBrowser1() {
		WebDriver driver = new EdgeDriver();
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
	public void EdgeBrowser2() {
		WebDriver driver = new EdgeDriver();
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
	public void EdgeBrowser3() {
		WebDriver driver = new EdgeDriver();
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
	public void EdgeBrowser4() {
		WebDriver driver = new EdgeDriver();
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
	public void EdgeBrowser5() {
		WebDriver driver = new EdgeDriver();
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
	public void EdgeBrowser6() {
		WebDriver driver = new EdgeDriver();
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
	public void EdgeBrowser7() {
		WebDriver driver = new EdgeDriver();
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
	public void EdgeBrowser8() {
		WebDriver driver = new EdgeDriver();
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
