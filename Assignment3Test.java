package ASeleniumDeloitte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment3Test {
	public String baseUrl="https://www.google.com";
  @Test
  public void verifyHomepageTitle() {
	  System.setProperty("webdriver.chrome.driver","C:\\software testing\\selenium\\chromedriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get(baseUrl);
	  String expectedTitle = "Google";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	 driver.close();
  }
}
