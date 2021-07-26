package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "H:\\java\\TaskMaven\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("facebook");
driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
driver.findElement(By.xpath("//h3[text()='Facebook - Log In or Sign Up']")).click();
driver.findElement(By.id("email")).sendKeys("wolverine");
driver.findElement(By.id("pass")).sendKeys("0123654789");
driver.findElement(By.name("login")).click();
}
}
