// Program using selenium webdriver . Count number of links in Holland and Barrett and print.
package com.LocatorsTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTestDemo {
	
	WebDriver driver;
	int total = 0;
	
	@BeforeTest
	public void LinkTest() {
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void findElementsById() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		Thread.sleep(20000);
		driver.findElement(By.linkText("Vitamins & Supplements")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		total = total + links.size();
		
		System.out.println("Number of Links:" + linkCount);
		for(int i = 1; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
	}

}
