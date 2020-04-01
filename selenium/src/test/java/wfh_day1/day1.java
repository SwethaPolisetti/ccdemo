package wfh_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class day1 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Raghav\\Downloads\\chrome selenium\\chromedriver.exe");
	 WebDriver dr=new ChromeDriver();
	  dr.get("http://demowebshop.tricentis.com/login");
	  dr.manage().window().maximize();
	  dr.findElement(By.id("Email")).sendKeys("karthik456@gmail.com");
	  dr.findElement(By.name("Password")).sendKeys("Karthik466$");
	  dr.findElement(By.xpath("//input[@value='Log in']")).click();
	  dr.close();
  }
}
