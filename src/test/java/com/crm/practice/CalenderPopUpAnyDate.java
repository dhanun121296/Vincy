package com.crm.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopUpAnyDate 
{
	public static void main(String[] args) throws Throwable 
	{
		//Set the web driver manager to chrome
				WebDriverManager.chromedriver().setup();
						
				//Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.makemytrip.com/");
						
				Actions act = new Actions(driver);
				act.moveByOffset(10, 10).click().perform();
						
				//Navigate to From and To Elements
				WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
				WebElement dst = driver.findElement(By.xpath("//input[@id='toCity']"));
						
				
						
				src.sendKeys("mumbai");
				driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
						
				Thread.sleep(2000);
						
				dst.sendKeys("chennai");
				driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
						
				Thread.sleep(2000);
						
				//navigate to departure
				driver.findElement(By.xpath("//label[@for='departure']")).click();
						
				//navigate to desired date in calender
				driver.findElement(By.xpath("//div[@aria-label='Fri Apr 22 2022']")).click();
		
	}

}
