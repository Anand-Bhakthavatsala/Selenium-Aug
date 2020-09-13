package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeFireFoxBrowserInvoke { //Java Naming convention/standard ->Not a must but recommended

	public static void titleValidation(String actual, String expected) //method -> Resuability
	{
		if(actual.equalsIgnoreCase(expected)) //true
		{
			System.out.println("Both expected and actial values are matching & hence TC pass");
		}
		else
			System.out.println("Both expected and actial values are NOT matching & hence TC fail");

	}

	public static void main(String[] args) throws InterruptedException {

		String browser = "firefox";
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			//open the chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");//key & the value/path
			driver = new ChromeDriver();//create a object in java
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			//open the Firefox browser
			System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");//key & the value/path
			driver = new FirefoxDriver();
		}	
		//enter the url 2nd step
		driver.get("https://www.google.com/");

		//To find the title of the page
		String expectedTitle = "google";
		String actualTitle = driver.getTitle();

		titleValidation(expectedTitle, actualTitle);//calling the static method

		//idenitfy the object - text field in google webpage
		WebElement textbox = driver.findElement(By.name("q"));

		//how to pass the text value -> Action		
		textbox.sendKeys("Automation");

		Thread.sleep(2000);// which will make the code to sleep for the specified time ->2k milliseconds is 2 seconds 
		//identify the object -> perform the action
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);

		expectedTitle = "Automation - Google Search"; //variable is changing
		actualTitle = driver.getTitle(); //Automation - Google Search

		titleValidation(expectedTitle, actualTitle);

		driver.close();
		System.out.println("Browser got closed");

	}

}
