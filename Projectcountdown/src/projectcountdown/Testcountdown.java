package projectcountdown;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testcountdown {
	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\sanju\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("http://shop.countdown.co.nz/");
			driver.findElement(By.cssSelector("#header-panel > div > div > div > div.span8.hidden-phone > ul > li:nth-child(5) > a")).click();
			driver.findElement(By.cssSelector("#Email")).sendKeys("komattil.sajeesh@gmail.com");
			driver.findElement(By.cssSelector("#Password")).sendKeys("Test@12345");
			driver.findElement(By.cssSelector("#content-panel > div > form > input.action-button-layout.din-bold.left-text.right-triangle-icon.main-action-button.pull-right")).click();
			driver.findElement(By.cssSelector("#search")).click();
			driver.findElement(By.cssSelector("#searchList > span")).click();
			driver.findElement(By.cssSelector("#content-panel > div > form > div.editSearchList-actions > a")).click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#content-panel > div > form > div.editSearchList-notepad > div > textarea")).sendKeys("Eggs");
			driver.findElement(By.cssSelector("#content-panel > div > form > div.editSearchList-notepad > div > textarea")).sendKeys("\n Milk");
			driver.findElement(By.cssSelector("#content-panel > div > form > div.editSearchList-notepad > div > textarea")).sendKeys("\n Meat");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#content-panel > div > form > div.editSearchList-actions > input.action-button-layout.din-bold.editSearchList-searchButton")).click();
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#product-list > div:nth-child(1) > div.gridProductStamp-trolley > div > div.trolleyControls.trolleyControls--compactDesktop > div.trolleyControls-outTrolley > form > button > span")).click();
	        driver.findElement(By.cssSelector("#search-list-navigation > div.navigation-buttons.row-fluid > a.action-button-layout.din-bold.next-button.left-text.right-triangle-icon.pull-right")).click();
	        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	        driver.findElement(By.cssSelector("#product-list > div:nth-child(1) > div.gridProductStamp-trolley > div > div.trolleyControls.trolleyControls--compactDesktop > div.trolleyControls-outTrolley > form > button")).click();
	        driver.findElement(By.cssSelector("#search-list-navigation > div.navigation-buttons.row-fluid > a.action-button-layout.din-bold.next-button.left-text.right-triangle-icon.pull-right")).click();
	        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	        driver.findElement(By.cssSelector("#product-list > div:nth-child(1) > div.gridProductStamp-trolley > div > div.trolleyControls.trolleyControls--compactDesktop > div.trolleyControls-outTrolley > form > button > span")).click();
	        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	        driver.findElement(By.cssSelector("#trolley-summary-panel > div > div.span8.trolley-panel-summary._showTrolleySlideBox > a")).click();
	        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//div[@id='trolley-summary-panel']/div/div[1]/a")).click();
	        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	        driver.findElement(By.cssSelector("#trolley-panel > div > div.trolley-totals.pull-right.row-fluid > div > div:nth-child(1) > a")).click();
	        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	        driver.findElement(By.cssSelector("#trolley-container > div.trolley-control-panel-border > div > div.trolley-buttons.span5.mrow-fluid > div.mtext-right.span6.mspan6 > a")).click();
	        	    		
			
	}

	} 


