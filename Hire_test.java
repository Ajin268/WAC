package test;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page.Hire_resource;

public class Hire_test
{
	WebDriver driver;
	@Test
	public void test() throws InterruptedException, TimeoutException
	{
		driver = new ChromeDriver();
//		driver.get("https://webandcrafts.com/resource-augmentation");
		driver.get("https://qa.wac501.webc.in/hire");
		driver.manage().window().maximize();
		Hire_resource rc = new Hire_resource(driver);
		
//		rc.titleverification();
//		rc.formfilling("adersh", "vinayan", "testing@bm.com", "7897897898");
//		rc.dropdown();
//		rc.validation();
//		rc.Lvalidation();
//		rc.emailvalidation();
//		rc.combination();
//		rc.phonenumb();
//		rc.privacy();
//		rc.field();
//		rc.brokenlink();
//		rc.scroll();
 		rc.hireres();
//		rc.scrollh();
//		rc.footer();
	
	}
	@AfterMethod
	public void af()
	{
		driver.quit();
	}

}

