package ASeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASettingSystemPropertyAssignment1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\software testing\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://LinkedIn.com");
		//to max the screen
		driver.manage().window().maximize();
		//finding the element using the locator
		driver.findElement(By.name("session_key")).sendKeys("aishwariyadharmaraj47@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("Dairymilk@2829");


	}

}
