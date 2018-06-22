package selenium.webdriverdemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day1 {
	
	WebDriver driver;
	JavascriptExecutor jsc;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("http://www.edureka.co");
			searchCourse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void searchCourse() {
		try {
			driver.findElement(By.id("homeSearchBar")).sendKeys("Java");
			Thread.sleep(3000);
			driver.findElement(By.id("homeSearchBarIcon")).click();
			jsc = (JavascriptExecutor)driver;
			jsc.executeScript("scroll(0,3000)");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Careers")).click();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Day1 myObj = new Day1();
		myObj.invokeBrowser();
		

	}

}
