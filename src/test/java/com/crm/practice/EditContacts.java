package com.crm.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditContacts
{
	@Test
	public void EditContact() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submitButton' and @value='Login']")).click();
		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		driver.findElement(By.xpath("//a[.='edit']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		WebElement e = driver.findElement(By.xpath("//input[@name='lastname']"));
		e.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		e.sendKeys("Seeee");
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
//		String text = e.getText();
//		System.out.println(text);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
