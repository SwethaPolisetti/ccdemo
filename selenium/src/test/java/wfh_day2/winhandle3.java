package wfh_day2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class winhandle3 {
  @Test
public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raghav\\Downloads\\chrome selenium\\chromedriver.exe");
	  WebDriver dr=new ChromeDriver();
      dr.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
      WebElement about_us = dr.findElement(By.xpath("//span[contains(text(),'AboutUs')]"));
      String parent = dr.getWindowHandle();
      Actions act1 = new Actions(dr);
      act1.moveToElement(about_us).build().perform();
      act1.moveToElement(dr.findElement(By.xpath("//span[contains(text(),'Our')]"))).click().build().perform();
      act1.moveToElement(dr.findElement(By.xpath("//span[contains(text(),'Chennai')]"))).click().build().perform(); 
      Set<String> set = dr.getWindowHandles();
      for (String win : set) {
          dr.switchTo().window(win);
          System.out.println("window handle ids are "+dr.getWindowHandle());
          
      }
      dr.switchTo().window(parent);
      dr.get("https://www.google.com");  
  }
}
