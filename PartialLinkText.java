package com.LocatorsTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PartialLinkText {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void linkTest() {
		driver.get("https://www.hollandandbarrett.com/");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/button[2]")).click();
		
		driver.findElement(By.partialLinkText("Vitamins")).click();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int nolinks = links.size();
		System.out.println("No. of Links in hollandand barrett Application:" + nolinks);
		
		for(int i =0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
			String str = links.get(i).getText();
			String str1 = "Vitamins";
			if(str == str1) {
				driver.findElement(By.linkText("Vitamins")).click();
				driver.findElement(By.xpath("//a[contains[@type,'button')]))[4]")).click();
			}
		}
		
	}

}
