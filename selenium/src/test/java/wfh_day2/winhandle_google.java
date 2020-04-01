package wfh_day2;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class winhandle_google {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raghav\\Downloads\\chrome selenium\\chromedriver.exe");
	  WebDriver dr=new ChromeDriver();
      dr.get("https://myaccount.google.com/");
      
      String parent_win_handle = dr.getWindowHandle();
      
      System.out.println("the window handle id is "+parent_win_handle);
      
      dr.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
      
      Set<String> handles = dr.getWindowHandles();
      for(String win : handles) {
          System.out.println("window handle"+win);
          dr.switchTo().window(parent_win_handle);
          
          
      }
    
      dr.get("http://demowebshop.tricentis.com");
      
    
      
      
  }
}
  
