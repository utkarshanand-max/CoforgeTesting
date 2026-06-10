package com.LocatorsTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassNameTestDemo {
	@Test
	public void TestDemo() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/button[2]")).click();
		driver.findElement(By.className("NavCategoryItem-module_categoryImage__mk1mV")).click();
		String BrowserTitle = driver.getCurrentUrl();
		System.out.println(BrowserTitle);
	}

}
