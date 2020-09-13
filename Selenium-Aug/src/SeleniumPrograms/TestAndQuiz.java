package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAndQuiz { //Java Naming convention/standard ->Not a must but recommended

	
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//syntax
		//enter the url 2nd step
		driver.get("https://www.testandquiz.com/selenium/testing.html");
	
		//To identify the link
	//	driver.findElement(By.linkText("This is a link")).click();	
		driver.findElement(By.partialLinkText("link")).click();
	//	driver.findElement(By.xpath("//a[contains(text(),'This is a link')]")).click();
	
		driver.navigate().back();//browser back link will be clicked
		
		//Textbox
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("learning");		
		
		//To identify the button
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
		//To identify and perform click on the radio button		
		WebElement radiobtnMale = driver.findElement(By.cssSelector("#male"));
		radiobtnMale.click();//click on male radio button
		if(radiobtnMale.isSelected()) //true
		{
			System.out.println("Male radio button is selected");
		}
		else
			System.out.println("Male radio button is NOT selected");
		//check box
		driver.findElement(By.xpath("//input[@class='Performance']")).click();
		
		WebElement dropDown = driver.findElement(By.cssSelector("#testingDropdown"));
		
		Select s = new Select(dropDown);
		s.selectByValue("Performance");
		Thread.sleep(2000);//forced sleep
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByVisibleText("Manual Testing");		
		
	//	driver.close();
		System.out.println("All the menthods of naviate is executed & Browser got closed");

	}

}
