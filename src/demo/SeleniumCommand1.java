package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCommand1 {

	WebDriver driver;
	JavascriptExecutor jse;

	public void InvokeBrowser() {

		try {
			// firefox driver
			System.setProperty("webdriver.gecko.driver", "D:\\workspaceJava\\Selenium\\utils\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			// chrome driver
			/*
			 *  System.setProperty("webdriver.chrome.driver", "D:\\workspaceJava\\Selenium\\utils\\chromedriver.exe");
			 driver = new ChromeDriver();
			 */
			
			// delete cookies
			driver.manage().deleteAllCookies();
			// maximize window
			driver.manage().window().maximize();
			// implicit wait -> wait till the task is execute; define max wait time
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// pageload time - load time of a page; define load time
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			// driver.get("");
			getCommands();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void getCommands() {
		try {
			// navigate to url
			driver.get("");
			driver.navigate().to(""); // same as driver.get();
			// Get title of the page
			String titleOfthePage = driver.getTitle();
			System.out.println("Title of the page " + titleOfthePage);
			// linkText
			driver.findElement(By.linkText("Home")).click();
			// Get Current URL
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current url " + currentUrl);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void login() {

		// find by xpath and fill with text
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("");

		// find by xpath and click on button
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();

		// scroll down of a page
		jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,1000)");
		driver.close();
	}
	
}
