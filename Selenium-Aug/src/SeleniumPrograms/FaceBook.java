package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook { //Java Naming convention/standard ->Not a must but recommended

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
		driver.get("https://www.facebook.com/");

		//logic to enter the values on text boxes	
		driver.findElement(By.name("email")).sendKeys("1234343");
		driver.findElement(By.id("pass")).sendKeys("test123");
		
		//login button -> click action
		driver.findElement(By.name("login")).click();
		
	//	driver.close();
		System.out.println("All the menthods of naviate is executed & Browser got closed");

	}

}
