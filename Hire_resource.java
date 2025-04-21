package page;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;

public class Hire_resource
{
	WebDriver driver;
	
	By Hire_resource = By.xpath("(//*[@class=\"fill btn btn-primary \"])[1]");
	By First_name = By.xpath("(//*[@placeholder=\"Enter first name\"])[1]");
	By Last_name = By.xpath("(//*[@placeholder=\"Enter last name\"])[1]");
	By Email = By.xpath("(//*[@name=\"email\"])[1]");
	By phone = By.xpath("(//*[@type=\"tel\"])[1]");
	By Choose_service = By.xpath("(//*[@id=\"dropdown-autoclose-outside\"])[1]");
	By Additional_info = By.xpath("(//*[@name=\"additionalinfo\"])[1]");
	By Checkbox = By.xpath("//*[@id=\"getQuoteInitialForm\"]");
	By Submit = By.xpath("(//*[@type=\"submit\"])[2]");
	By firstnamevalidation = By.xpath("//input[@name='firstName']/following-sibling::div[@class='d-block mt-1 invalid-feedback']");
	By lastnamevalidation = By.xpath("//input[@name='lastName']/following-sibling::div[@class='d-block mt-1 invalid-feedback']");
	By emailvalidation = By.xpath("//input[@name='email']/following-sibling::div[contains(@class, 'invalid-feedback')]");
	By submitbutton = By.xpath("//button[@type='submit']//span[text()='Submit']");
	By phonenumvalidation = By.xpath("//input[@type='tel']/ancestor::div[contains(@class, 'customPhoneNumberInput_mobile_wrapper__xwqq4')]//div[contains(@class, 'invalid-feedback')]");
	By Checkbox_validation = By.xpath("//div[contains(@class, 'form-group') and contains(@class, 'checkbox-wrapper')]//p[contains(@class, 'invalid-feedback')]");	
	By privacypolicy = By.xpath("(//*[@class=\"form-check-label d-inline\"])[1]");
	
/// 2nd page
	
	By Engagement_type = By.xpath("(//*[@class=\"custom-select__input-container css-19bb58m\"])[1]");
	By commencement = By.xpath("(//*[@class=\"custom-select__input-container css-19bb58m\"])[2]");
	By Submit2 = By.xpath("(//*[@type=\"submit\"])[1]");
	
	By hiredevp = By.xpath("(//*[@type=\"button\"])[3]");
	
	By Scroll = By.xpath("//div[@class=\"resourceAugCardStack_card_img1_img__ZEdnB \"]");
	public Hire_resource(WebDriver driver) 
	{
		this.driver=driver;
	}

	
//TITLE VERIFICATION
	
		public void titleverification()
		{
			String title_ver =driver.getTitle();
			String expected_title = "Resource Augmentation Services | Enhance Your Digital Capabilities";
			if(title_ver.equalsIgnoreCase(expected_title))
			{
				System.out.println("Title verified " );
				System.out.println("Title is: " +title_ver);
			}
			else
			{
				System.out.println("title is incorrect");
			}
			
		}
		
//HAPPY FLOW TESTING
	
	public void formfilling(String fname,String lname,String emaill,String num ) throws InterruptedException
	
	{
//		Thread.sleep(2000);
//		driver.findElement(Hire_resource).click();
		
		Thread.sleep(1000);
		WebElement fstname = driver.findElement(First_name);
		fstname.click();
		fstname.sendKeys(fname);
		String a =	fstname.getAttribute("value");
		System.out.println(a);
		
		Thread.sleep(1000);
		WebElement lstname = driver.findElement(Last_name);
		lstname.click();
		lstname.sendKeys(lname);
		String b =	lstname.getAttribute("value");
		System.out.println(b);
		
		Thread.sleep(1000);
		WebElement eml=	driver.findElement(Email);
		eml.click();
		eml.sendKeys(emaill);
		String c =	eml.getAttribute("value");
		System.out.println(c);
		
		Thread.sleep(1000);
		WebElement numm = driver.findElement(phone);
		numm.click();
		numm.sendKeys(num);
		String d =	numm.getAttribute("value");
		System.out.println(d);
		
		Thread.sleep(1000);
		WebElement	Service = driver.findElement(Choose_service);
		Service.click();
		driver.findElement(By.xpath("//*[@id=\"E-commerce\"]")).click();
		
		Thread.sleep(1000);
		WebElement additional_info = driver.findElement(Additional_info);
		additional_info.click();
		StringBuilder longText = new StringBuilder();
		for (int i = 0; i < 1001; i++)
		{
		    longText.append("z");
		}
		additional_info.sendKeys(longText.toString());
		
		//CHECKBOX CLICKING
		
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"getQuoteInitialForm\"]")));
		Actions act = new Actions(driver);
		act.click(checkbox);
 		act.perform();
		

//CLICK SUBMIT BUTTON
 		
		Thread.sleep(4000);
		WebElement submitB = driver.findElement(submitbutton);
		Actions acd = new Actions(driver);
		acd.scrollToElement(submitB);
	
		acd.click(submitB);
		acd.perform();
		
		Thread.sleep(3000);
//NEXT PAGE 
		
		WebElement aa= driver.findElement(Engagement_type);
		Actions acti = new Actions(driver);
		acti.click(aa);
		acti.sendKeys(Keys.ENTER);
		acti.perform();
		
		Thread.sleep(3000);
		WebElement ax = driver.findElement(commencement);
		Actions avc = new Actions(driver);
		avc.click(ax);
		avc.sendKeys(Keys.ENTER);
		avc.perform();
		
//		driver.findElement(Submit2).click();
		
		
//		driver.findElement(submitbutton).click();
		
		
		
	}
	
//DROPDOWN HANDLING
	
	public void dropdown() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement	Service = driver.findElement(Choose_service);
		Service.click();
		driver.findElement(By.xpath("//*[@id=\"E-commerce\"]")).click();

	}


	
//FIRST NAME VALIDATION CHECKING
	
	public void validation() throws InterruptedException
	{
		
			
//	
		
		Thread.sleep(2000);
		WebElement name = driver.findElement(First_name);
		 String[] testInputs = {"12345", "!@#$%", "A", "","shine "};
		 
		 for (String input : testInputs)
		 {
			
				name.sendKeys(Keys.CONTROL + "a"); 
			 	name.sendKeys(Keys.BACK_SPACE);	            
			 	name.sendKeys(input,Keys.ENTER);
	            String enteredValue = name.getAttribute("value"); 
	            
	            System.out.println("Input: " + input + " | Accepted: " + enteredValue);
	            
	            WebElement errorMessageName = driver.findElement(firstnamevalidation);
	            if (errorMessageName.isDisplayed()) 
	            {
	                System.out.println("Input: " + enteredValue + " | Validation Message: " + errorMessageName.getText());
	            }
	            
	            else 
	            {
	                System.out.println("Input: " + name + " | No validation message displayed.");
	            }
			 
			
		 }
		
	
	}
	
//LAST NAME VALIDATION CHECKING
	
	public void Lvalidation() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(Hire_resource).click();
		
		Thread.sleep(2000);
		WebElement lname = driver.findElement(Last_name);
		 String[] testInputs = {"12345", "!@#$%", "joseph", ""};
		 
		 for (String input : testInputs)
		 {
				lname.sendKeys(Keys.CONTROL + "a"); 
			 	lname.sendKeys(Keys.BACK_SPACE);	            
			 	lname.sendKeys(input,Keys.ENTER);
	            String enteredValue = lname.getAttribute("value"); 
	            
	            System.out.println("Input: " + input + " | Accepted: " + enteredValue);
	            
	            WebElement errorMessageName = driver.findElement(lastnamevalidation);
	            
	            if (errorMessageName.isDisplayed()) 
	            {
	                System.out.println("Input: " + enteredValue + " | Validation Message: " + errorMessageName.getText());
	            } 
	            else 
	            {
	                System.out.println("Input: " + lname + " | No validation message displayed.");
	            }
		 }
		
	}
	
//EMAIL FIELD VALIDATION CHECKING
	
	public void emailvalidation() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(Hire_resource).click();
		Thread.sleep(2000);

		driver.findElement(First_name).sendKeys("1111");
		Thread.sleep(2000);

		driver.findElement(Last_name).sendKeys("11111");
		Thread.sleep(2000);
		WebElement emaill = driver.findElement(Email);
		Thread.sleep(2000);
	    String[] testEmails =
				 {
			            "plainaddress", 
			            "@missingusername.com", 
			            "username@.com", 
			            "username@domain", 
			            "username@domain.c", 
			            "user.name+tag@domain.co.in",
			            "example@example.com"
			      };
			 
			 
		for (String email : testEmails) 
			 {
//		            emaill.clear();
				 	emaill.sendKeys(Keys.CONTROL + "a"); 
				 	emaill.sendKeys(Keys.BACK_SPACE);
		            emaill.sendKeys(email,Keys.TAB);
            		Thread.sleep(1000);

		            WebElement sub = driver.findElement(submitbutton);
		            Actions ac = new Actions(driver);
		            ac.click(sub);
		            ac.perform();
		            
		            String enteredValue = emaill.getAttribute("value"); 
		            
		           // System.out.println("Input: " + email + " | Accepted: " + enteredValue);
		 try
		       {
		    	  Thread.sleep(1000);

		            WebElement errorMessage = driver.findElement(emailvalidation);
		            if (errorMessage.isDisplayed()) 
		            {
		                System.out.println("Input: " + email + " | Validation Message: " + errorMessage.getText());
		            } 
		            
		            else 
		            {
		                System.out.println("Input: " + email + " | No validation message displayed.");
		            }
		       }
		 catch(Exception e)
		       {
		    	   System.out.println(e);
		       }
		           
		     }
		
	}
	
	
	//PHONE NUMBER VALIDATION CHECKING
	
		public void phonenumb() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.findElement(Hire_resource).click();
			
			Thread.sleep(2000);
			WebElement PNUM = driver.findElement(phone);
			 String[] testInputs = 
				 
				 {
						 "+11234567890",      // US number with country code
					    "+919876543210",     // Indian mobile number
					    "0123456789",        // Local number (without country code)
					    "+447911123456",     // UK mobile number
					    "+4915234567890",    // German mobile number
					    "+61400123456",      // Australian mobile number
					    "+819012345678",     // Japanese mobile number
					    "+971501234567",     // UAE mobile number
					    "+33612345678",      // French number
					    "+79123456789" , 	// Russian number
					    
					    "12345"   ,           // Too short
					    "abcdefghij",           // Alphabets only
					    "123-456-7890",         // No country code (if required)
					    "+91123456789",         // Incorrect length for India
					    "+123",                 // Incomplete number
					    "+91-98765-4321@",      // Special character at end
					    "+44 7911 12345",       // Too short for UK
					    "+49 1523 4567a90",     // Contains alphabets
					    "+61 400 123 45 6789",  // Too long
					    "98765432109876543210"  // Exceeds valid length
					    
			 
			 
				 };
			 
			 for (String input : testInputs)
			 {
				 PNUM.sendKeys(Keys.CONTROL + "a"); 
				 PNUM.sendKeys(Keys.BACK_SPACE);	            
				 PNUM.sendKeys(input);
				  WebElement sub = driver.findElement(submitbutton);
		            Actions ac = new Actions(driver);
		            ac.click(sub);
		            ac.perform();
		            String enteredValue = PNUM.getAttribute("value"); 
		            
//		            System.out.println("Input: " + input + " | Accepted: " + enteredValue);
		            
		            try 
		            {
		            	Thread.sleep(4000);
		                WebElement errorMessageName = driver.findElement(phonenumvalidation);
		                if (errorMessageName.isDisplayed()) 
		                {
		                    System.out.println("Input: " + enteredValue + " | Validation Message: " + errorMessageName.getText());
		                }
		                PNUM.sendKeys(Keys.CONTROL + "a"); 
		                PNUM.sendKeys(Keys.BACK_SPACE); // Clear only if error message is displayed
		            }
		            
		            catch (NoSuchElementException e)
		            
		            {
		                System.out.println("Input: " + enteredValue + " | No validation message displayed: Accepted.");
		                // If no validation message, don't clear the field.
		            }
			 }
			
		}
		
	
//COMBINATION TESTING FOR ALL VALIDATION
	
	public void combination() throws InterruptedException
	{
		
		 System.out.println("First name field validation test");
		 System.out.println("");


//		Thread.sleep(2000);
//		driver.findElement(Hire_resource).click();
//		Thread.sleep(2000);

		
		Thread.sleep(2000);
		WebElement name = driver.findElement(First_name);
		 String[] testInputs = {"12345", "!@#$%", "A", " ","Shine"};
		 
		 for (String input : testInputs)
		 {
				name.sendKeys(Keys.CONTROL + "a"); 
			 	name.sendKeys(Keys.BACK_SPACE);	            
			 	name.sendKeys(input,Keys.ENTER);
	            String enteredValue = name.getAttribute("value"); 
	            
//	            System.out.println("Input: " + input + " | Accepted: " + enteredValue);
	            
	            try 
	            {
	                WebElement errorMessageName = driver.findElement(firstnamevalidation);
	                if (errorMessageName.isDisplayed()) 
	                {
	                    System.out.println("Input: " + enteredValue + " | Validation Message: " + errorMessageName.getText());
	                }
	                name.sendKeys(Keys.CONTROL + "a"); 
	                name.sendKeys(Keys.BACK_SPACE); // Clear only if error message is displayed
	            }
	            
	            catch (NoSuchElementException e)
	            
	            {
	                System.out.println("Input: " + enteredValue + " | No validation message displayed: Accepted.");
	                // If no validation message, don't clear the field.
	            }
		 }
		 
		 System.out.println("");

		 System.out.println("Last name validation");
		 
		 System.out.println("");

		 
		 
		 Thread.sleep(2000);
			WebElement lname = driver.findElement(Last_name);
			 String[] testInputss = {"12345", "!@#$%", "    ", "joseph"};
			 
			 for (String inputs : testInputss)
			 {
					lname.sendKeys(Keys.CONTROL + "a"); 
				 	lname.sendKeys(Keys.BACK_SPACE);	            
				 	lname.sendKeys(inputs,Keys.ENTER);
		            String enteredValue = lname.getAttribute("value"); 
		            
//		            System.out.println("Input: " + input + " | Accepted: " + enteredValue);
		            
		            try 
		            {
		                WebElement errorMessageNamee = driver.findElement(lastnamevalidation);
		                if (errorMessageNamee.isDisplayed()) 
		                {
		                    System.out.println("Input: " + enteredValue + " | Validation Message: " + errorMessageNamee.getText());
		                }
		                lname.sendKeys(Keys.CONTROL + "a"); 
		                lname.sendKeys(Keys.BACK_SPACE); // Clear only if error message is displayed
		            }
		            
		            catch (NoSuchElementException e)
		            
		            {
		                System.out.println("Input: " + enteredValue + " | No validation message displayed: Accepted.");
		                // If no validation message, don't clear the field.
		            }
			 }
			 
			 System.out.println("");
			 System.out.println("Email field validation Test");
			 System.out.println("");



			 
			 WebElement emaill = driver.findElement(Email);
				Thread.sleep(2000);
			    String[] testEmails =
						 {
					            "plainaddress", 
					            "@missingusername.com", 
					            "username@.com", 
					            "username@domain", 
					            "username@domain.c", 
					            "user.name+tag@domain.co.in",
					            "example@example.com"
					      };
					 
					 
				for (String email : testEmails) 
					 {
//				            emaill.clear();
						 	emaill.sendKeys(Keys.CONTROL + "a"); 
						 	emaill.sendKeys(Keys.BACK_SPACE);
				            emaill.sendKeys(email,Keys.ENTER);
		            		Thread.sleep(1000);

//				            WebElement sub = driver.findElement(submitbutton);
//				            Actions ac = new Actions(driver);
//				            ac.click(sub);
//				            ac.perform();
				            
				            String Emailvalue = emaill.getAttribute("value"); 
				            
//				            System.out.println("Input: " + email + " | Accepted: " + enteredValue);
				            try 
				            {
				                WebElement errorMessageNameee = driver.findElement(emailvalidation);
				                if (errorMessageNameee.isDisplayed()) 
				                {
				                    System.out.println("Input: " + Emailvalue + " | Validation Message: " + errorMessageNameee.getText());
				                }
				                lname.sendKeys(Keys.CONTROL + "a"); 
				                lname.sendKeys(Keys.BACK_SPACE); // Clear only if error message is displayed
				            }
				            
				            catch (NoSuchElementException e)
				            
				            {
				                System.out.println("Input: " + Emailvalue + " | No validation message displayed: Accepted.");
				                // If no validation message, don't clear the field.
				            }
				           
				     } 
			 
				System.out.println();
				
				System.out.println( "PHONE NUMBER VALIDATION TEST");
				
				System.out.println();
				
				Thread.sleep(2000);
				WebElement PNUM = driver.findElement(phone);
				 String[] testInputsss = 
					 
					 {
							 "+11234567890",      // US number with country code
						    "+919876543210",     // Indian mobile number
						    "0123456789",        // Local number (without country code)
						    "+447911123456",     // UK mobile number
						    "+4915234567890",    // German mobile number
						    "+61400123456",      // Australian mobile number
						    "+819012345678",     // Japanese mobile number
						    "+971501234567",     // UAE mobile number
						    "+33612345678",      // French number
						    "+79123456789" , 	// Russian number
						    
						    "12345"   ,           // Too short
						    "abcdefghij",           // Alphabets only
						    "123-456-7890",         // No country code (if required)
						    "+91123456789",         // Incorrect length for India
						    "+123",                 // Incomplete number
						    "+91-98765-4321@",      // Special character at end
						    "+44 7911 12345",       // Too short for UK
						    "+49 1523 4567a90",     // Contains alphabets
						    "+61 400 123 45 6789",  // Too long
						    "98765432109876543210"  // Exceeds valid length
						    
				 
				 
					 };
				 
				 for (String input : testInputsss)
				 {
					 PNUM.sendKeys(Keys.CONTROL + "a"); 
					 PNUM.sendKeys(Keys.BACK_SPACE);	            
					 PNUM.sendKeys(input);
					  WebElement sub = driver.findElement(submitbutton);
			            Actions ac = new Actions(driver);
			            ac.click(sub);
			            ac.perform();
			            String enteredValue = PNUM.getAttribute("value"); 
			            
//			            System.out.println("Input: " + input + " | Accepted: " + enteredValue);
			            
			            try 
			            {
			            	Thread.sleep(4000);
			                WebElement errorMessageName = driver.findElement(phonenumvalidation);
			                if (errorMessageName.isDisplayed()) 
			                {
			                    System.out.println("Input: " + enteredValue + " | Validation Message: " + errorMessageName.getText());
			                }
			                PNUM.sendKeys(Keys.CONTROL + "a"); 
			                PNUM.sendKeys(Keys.BACK_SPACE); // Clear only if error message is displayed
			            }
			            
			            catch (NoSuchElementException e)
			            
			            {
			                System.out.println("Input: " + enteredValue + " | No validation message displayed: Accepted.");
			                // If no validation message, don't clear the field.
			            }
				 }
				 
		Thread.sleep(5000);
		WebElement	Service = driver.findElement(Choose_service);
		Service.click();
		WebElement ax =	driver.findElement(By.xpath("//*[@id=\"E-commerce\"]"));
		Actions ac = new Actions(driver);
		ac.click(ax);
		ac.perform();
		Service.click();
	
	

		Thread.sleep(1000);
		WebElement additional_info = driver.findElement(Additional_info);
		additional_info.click();
		StringBuilder longText = new StringBuilder();
		for (int i = 0; i < 1001; i++)
		{
		    longText.append("z");
		}
		additional_info.sendKeys(longText.toString());
		
//CHECKBOX CLICKING
		
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"getQuoteInitialForm\"]")));
		Actions act = new Actions(driver);
		act.click(checkbox);
 		act.perform();		
		
//SUBMIT BUTTON CLICKING
 		
 		Thread.sleep(5000);
		WebElement submitB = driver.findElement(Submit2);
		Actions acd = new Actions(driver);
//		acd.scrollToElement(submitB);
	
		acd.click(submitB);
		acd.perform();
			 
	}

//Privacy policy checking
	public void privacy() throws InterruptedException
	{
//		Thread.sleep(2000);
//		driver.findElement(Hire_resource).click();
		Thread.sleep(2000);
		WebElement privacy = driver.findElement(privacypolicy);
		privacy.click();
		
// Store the original tab handle
		
	    String originalTab = driver.getWindowHandle();
	    Thread.sleep(2000);

	    // Get all window handles
	    Set<String> allTabs = driver.getWindowHandles();

	    // Switch to the new tab
	    for (String tab : allTabs)
	    {
	        if (!tab.equals(originalTab)) 
	        {
	            driver.switchTo().window(tab);
	            break;
	        }
	    }

	    Thread.sleep(4000);
	    String newTabTitle = driver.getTitle();
	    System.out.println("Title of new tab: " + newTabTitle);
	    
	    if(newTabTitle.contains("Privacy Policy"))
	    {
	    	System.out.println("Title verification Passed");
	    }
	    else
	    {
	    	System.out.println("Failed");
	    }

	    driver.close();
//Switch back to the original tab
	    
	   driver.switchTo().window(originalTab);
		
	}

//Attribute checking 
	
	public void field() throws InterruptedException
	{
		 System.out.println("Attribute Checking");
		 System.out.println("");


		Thread.sleep(2000);
		driver.findElement(Hire_resource).click();
		Thread.sleep(2000);
		
		WebElement aa = driver.findElement(First_name);
		aa.sendKeys("Anoop");
		String a=	aa.getAttribute("value");
		System.out.println(a);
		driver.quit();
		
	}

//Broken link test in resource augmentation page 
	
	public void brokenlink()
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));


		// Iterating each link and checking the response status
		for (WebElement link : links) 
		{
			String url = link.getAttribute("href");
			verifyLink(url);
		}


		}


		public static void verifyLink(String url)
		
		{
		try
		{
			URL link = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();


			if (httpURLConnection.getResponseCode() <=404)
			{
			System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			} else 
			
			{
			System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
		} 
		
		catch (Exception e)
		{
			System.out.println(url + " - " + "is a broken link");
		}
	}

//Scroll checking
		
		public void scroll() throws InterruptedException
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 1000);");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 1000);");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 1000);");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 1000);");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 1000);");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 1000);");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 1000);");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 1000);");
			Thread.sleep(1000);


			
		}

//Hire developer form filling
		
		public void hireres() throws InterruptedException, TimeoutException
		{
			handlePopupIfPresent();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 1000);");
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 1000);");
			driver.findElement(hiredevp).click();
			Thread.sleep(2000);
			
			titleverification();
			formfilling("Anjitha", "Ashokan", "Anji@gmail.com", "9589898989");
			
		}

//Hire developer Scroll handling
		
		public void scrollh() throws InterruptedException
		{
			WebElement Asd = driver.findElement(By.xpath("//*[@class=\"resourceAugCardStack_heading__G4SV5\"]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", Asd);
			
			Thread.sleep(1000);
			List<WebElement> ze = driver.findElements(Scroll);

			int count=0;
			 for (WebElement c1 : ze) 
			 {
			        System.out.println(c1.getText());

			        // Take screenshot in each loop
			        takeScreenshot("scroll_section_" + count);
			        count++;

			        js.executeScript("window.scrollBy(0, 500)");
			        Thread.sleep(3000);
			    }
			
		}
		public void takeScreenshot(String name) 
		{
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
		    String timestamp = sdf.format(new Date());

		    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    File dest = new File("screenshots/" + name + "_" + timestamp + ".png");

		    try 
		    {
		        FileUtils.copyFile(src, dest);
		        System.out.println("Screenshot saved: " + dest.getAbsolutePath());
		    } catch (IOException e) 
		    {
		        e.printStackTrace();
		    }
		
	
	
		}
//Footer content extracting		
		public void footer()
		{
			WebElement footer = driver.findElement(By.xpath("(//*[@class=\"container\"])[8]"));
			System.out.println(footer.getText());
		}
		
//Pop up Case
		
		public void handlePopupIfPresent() throws TimeoutException
		{
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".quoteModal_modal_grid__8PGcn"))); // update selector if needed
		        if (popup.isDisplayed())
		        {
		            System.out.println("Popup detected. Trying to close...");

		            // Use the actual close button selector inside the popup
		            WebElement closeBtn = popup.findElement(By.cssSelector(".close-button-selector")); // Update this!
		            closeBtn.click();

		            // Optional: wait a moment to ensure it's dismissed
		            Thread.sleep(1000);
		        }
		    } 
		    catch (Exception e) 
		    {
		        System.out.println("Error while handling popup: " + e.getMessage());
		    }
		}

}


