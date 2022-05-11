package com.crm.practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopUpCurrentDate {
	@Test
	public  void  CalenderPopUpWithCurrentDate()throws Throwable {
		
			Date date = new Date();
			String[] d = date.toString().split(" ");
			String day = d[0];
			String month = d[1];
			String date1 = d[2];
			String year = d[5];
			
			String travelDate=day+" "+month+" "+date1+" "+year;
			System.out.println(travelDate);
			
			
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
			WebDriverWait w1=new WebDriverWait(driver, 20);
			WebElement e = driver.findElement(By.xpath("//div[@aria-label='"+travelDate+"']"));
			w1.until(ExpectedConditions.visibilityOf(e));
	        e.click();
	        
		}

	}

	

