package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {	

	public static void main(String[] args) throws InterruptedException {
		
		//open the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");//key & the value/path
		ChromeDriver driver = new ChromeDriver();//create a object in java
	
		//enter the url 2nd step
		driver.get("https://www.google.com/");
		
		//To find the title of the page
		String expectedTitle = "google";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equalsIgnoreCase(actualTitle)) //true
		{
			System.out.println("Both expected and actial values are matching & hence TC pass");
		}
		else
			System.out.println("Both expected and actial values are NOT matching & hence TC fail");
		
		//idenitfy the object - text field in google webpage
		WebElement textbox = driver.findElement(By.name("q"));
		
		//how to pass the text value -> Action		
		textbox.sendKeys("Automation");
		
		Thread.sleep(2000);// which will make the code to sleep for the specified time ->2k milliseconds is 2 seconds 
		//identify the object -> perform the action
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		
		expectedTitle = "Google Search"; //variable is changing
		actualTitle = driver.getTitle(); //Automation - Google Search
		
		if(expectedTitle.equals(actualTitle)) //not true -> "Google Search" v/s "Automation - Google Search"
		{
			System.out.println("Both expected and actial values are matching & hence TC pass");
		}
		else
			System.out.println("Both expected and actual values are NOT matching & hence TC fail");
		
		driver.close();
		System.out.println("Browser got closed");		
		
	}
}
