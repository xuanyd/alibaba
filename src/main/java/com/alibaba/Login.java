package com.alibaba;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	public String login(String userName, String password) {
		System.getProperties().setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		System.out.println("打开浏览器--------------------------------------------------------------------------------------------------------------");
        String baseUrl = "http://pub.alimama.com/";
        webDriver.manage().window().maximize();
		System.out.println("页面最大化--------------------------------------------------------------------------------------------------------------");
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://www.alimama.com/member/minilogin.htm?redirect=https://pub.alimama.com&custom_style=alimama");
        
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 5);
       /* WebElement webElement = webDriver.findElement(By.id("mx_n_20"));
        java.util.List<WebElement> lis = webElement.findElement(By.tagName("ul")).findElements(By.tagName("li"));
        
        lis.get(1).click();
        Thread.sleep(3000);*/
        
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("J_logname"))).sendKeys(userName);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("J_logpassword"))).sendKeys(password);

        WebElement source = admcDriver.findElement

        /*webDriver.switchTo().frame(0);
        webDriver.findElement(By.id("J_Quick2Static")).click();
        //休息5秒
        Thread.sleep(5000);
        webDriver.findElement(By.cssSelector("span.ph-label")).click();
        webDriver.findElement(By.id("TPL_username_1")).clear();
        webDriver.findElement(By.id("TPL_username_1")).sendKeys(username);
        webDriver.findElement(By.id("TPL_password_1")).clear();
        webDriver.findElement(By.id("TPL_password_1")).sendKeys(password);*/
        return "";
	}
}
