package wfh_day2;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class data_driven {
  private XSSFWorkbook wb;

@Test
  public void f() throws IOException, InterruptedException {
	  File src = new File("C:\\Selenium\\Book2.xlsx");
      FileInputStream fis = new FileInputStream(src);
      
      wb = new XSSFWorkbook(fis);
      
      XSSFSheet sheet_a = wb.getSheetAt(0);
    //  XSSFSheet sheet_one = wb.getSheet("Sheet1");
      
      
      int rows_count = sheet_a.getLastRowNum();
      System.out.println("the total number of rows are "+rows_count);
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raghav\\Downloads\\chrome selenium\\chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
          ((WebDriver) driver).get("http://demowebshop.tricentis.com/login");
         ((WebDriver) driver).manage().window().maximize();
         Thread.sleep(3000);
      
      for (int i=0;i<=rows_count;i++)
      {
          String username = sheet_a.getRow(i).getCell(0).getStringCellValue();
          System.out.println("Test data from excel sheet is :" +username);
          String pwd = sheet_a.getRow(i).getCell(1).getStringCellValue();
          System.out.println("Test data from excel sheet is :" +pwd);
          driver.findElement((By) By.id("Email")).sendKeys(username);
        //  driver.findElement(By.className("Email")).sendKeys(username);
        //  driver.findElement(By.id("Email")).sendKeys(username);
          driver.findElement((By) By.id("Password")).sendKeys(pwd);
          driver.findElement((By) By.xpath("//input[@value='Log in']")).click();
          //Thread.sleep(3000);
          driver.findElement((By) By.className("ico-logout")).click();
          driver.findElement((By) By.className("ico-login")).click();
      }
      
  }
}




  
