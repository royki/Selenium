package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCommand2 {

	WebDriver driver;
	JavascriptExecutor jse;

	public void InvokeBrowser() {

		try {
			// firefox driver
			System.setProperty("webdriver.gecko.driver", "D:\\workspaceJava\\Selenium\\utils\\geckodriver.exe");
			driver = new FirefoxDriver();

			// chrome driver
			/*
			 * System.setProperty("webdriver.chrome.driver","D:\\workspaceJava\\Selenium\\utils\\chromedriver.exe");
			 *  driver = new ChromeDriver();
			 */

			// delete cookies
			driver.manage().deleteAllCookies();
			// maximize window
			driver.manage().window().maximize();
			// implicit wait -> wait till the task is execute; define max wait time
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// pageload time - load time of a page; define load time
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			// Direct to url
			// driver.get("http://flipcart.com");

			// call navigateCommand() method
			navigateCommand();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void navigateCommand() throws InterruptedException {

		/*
		 * navigate page - driver.navigate().to("");
		 * driver.navigate().back();
		 * driver.navigate().refresh(); -> refresh a page
		 * driver.navigate().forward();
		 */
		driver.navigate().to("https://www.amazon.in");
		String titleOfthePage = driver.getTitle();
		System.out.println(titleOfthePage);
		driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
