package test_pipeline;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver x;
	String title;
	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		  
		  DesiredCapabilities cp=DesiredCapabilities.firefox();
		  
		  x= new FirefoxDriver();
		  x.get("http://18.222.29.115:8090/BloggingApplication-0.0.1-SNAPSHOT/");
		  
	  }
	@Test
  public void f() {
	  //System.out.println("came");
	  x.findElement(By.xpath("//*[ @name='title'] ")).sendKeys("narri");
	  x.findElement(By.xpath("//*[ @value='send_title'] ")).click();
	  
	 // x.findElement(By.xpath("//*[ @name='category'] ")).sendKeys("narri");
	  //x.findElement(By.xpath("//*[ @name='author'] ")).sendKeys("narri");
	  
	  title = x.getTitle();
	  
	  System.out.println("Title = "+title);
  }

  @AfterTest
  public void afterTest() {
  }

}
