package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesForceValidation { //Java Naming convention/standard ->Not a must but recommended

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

		String browser = "chrome";
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			//open the chrome browser
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//key & the value/path
			driver = new ChromeDriver();//create a object in java
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			//open the Firefox browser
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");//key & the value/path
			driver = new FirefoxDriver();
		}	
		//enter the url 2nd step
		driver.get("https://login.salesforce.com/?locale=in");

		//logic to enter the values on text boxes	
		WebElement username = driver.findElement(By.cssSelector("#username"));
		username.sendKeys("Mithun");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("renjit");
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);//delay
		String errorMsg = driver.findElement(By.cssSelector("#error")).getText();
		System.out.println(errorMsg);
		
		if(errorMsg.contains("Please check your username and password")) //true
		{
			System.out.println("Login failed...Test case failed with invalid credentials");
		}
		else
		{
			System.out.println("Login is successful");
		}
		
	//	driver.close();
		System.out.println("All the steps are executed");

	}

}
