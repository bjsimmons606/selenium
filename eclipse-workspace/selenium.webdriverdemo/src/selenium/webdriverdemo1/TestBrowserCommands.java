package selenium.webdriverdemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowserCommands {
	
	WebDriver driver;
	
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("http://www.amazon.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeBrowser() {
		try {
			//driver.close();
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		TestBrowserCommands myObj = new TestBrowserCommands();
		myObj.invokeBrowser();
		myObj.closeBrowser();

	}

}
