package org.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Hari\\Basic\\Jars\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("123456789");
	TakesScreenshot t=(TakesScreenshot) driver;
}
}
