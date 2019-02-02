package stepDefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Countdown {

public static WebDriver driver;
	
	@Given("^User open countdown page in chrome browser$")
	public void User_open_countdown_page_in_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanju\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://shop.countdown.co.nz/");
		driver.findElement(By.cssSelector("#header-panel > div > div > div > div.span8.hidden-phone > ul > li:nth-child(5) > a")).click();		
		}
	
	@When("^User login with valid credentials$")
	public void User_login_with_valid_credentials() throws Throwable {
		
		driver.findElement(By.cssSelector("#Email")).sendKeys("komattil.sajeesh@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("Test@12345");
		driver.findElement(By.cssSelector("#content-panel > div > form > input.action-button-layout.din-bold.left-text.right-triangle-icon.main-action-button.pull-right")).click();
		
	}
	@Then("^Start searching items from the shop list page$")
	public void start_searching_below_items_from_the_shop_from_a_list_page() throws Throwable {
		driver.findElement(By.cssSelector("#search")).click();
		driver.findElement(By.cssSelector("#searchList > span")).click();
		driver.findElement(By.cssSelector("#content-panel > div > form > div.editSearchList-actions > a")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#content-panel > div > form > div.editSearchList-notepad > div > textarea")).sendKeys("Eggs");
		driver.findElement(By.cssSelector("#content-panel > div > form > div.editSearchList-notepad > div > textarea")).sendKeys("\n Milk");
		driver.findElement(By.cssSelector("#content-panel > div > form > div.editSearchList-notepad > div > textarea")).sendKeys("\n Meat");
		
	}

	@Then("^The relavent products should be displayed in the search results page$")
	public void the_relavent_products_should_be_displayed_in_the_search_results_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#content-panel > div > form > div.editSearchList-actions > input.action-button-layout.din-bold.editSearchList-searchButton")).click();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}

	@Then("^Adding the required number of each items into the trolly$")
	public void adding_the_required_number_of_each_items_into_the_trolly() throws Throwable {
		driver.findElement(By.cssSelector("#product-list > div:nth-child(1) > div.gridProductStamp-trolley > div > div.trolleyControls.trolleyControls--compactDesktop > div.trolleyControls-outTrolley > form > button > span")).click();
        driver.findElement(By.cssSelector("#search-list-navigation > div.navigation-buttons.row-fluid > a.action-button-layout.din-bold.next-button.left-text.right-triangle-icon.pull-right")).click();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#product-list > div:nth-child(1) > div.gridProductStamp-trolley > div > div.trolleyControls.trolleyControls--compactDesktop > div.trolleyControls-outTrolley > form > button")).click();
        driver.findElement(By.cssSelector("#search-list-navigation > div.navigation-buttons.row-fluid > a.action-button-layout.din-bold.next-button.left-text.right-triangle-icon.pull-right")).click();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#product-list > div:nth-child(6) > div.gridProductStamp-trolley > div > div.trolleyControls.trolleyControls--compactDesktop > div.trolleyControls-outTrolley > form > button > span")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        
	}

	@Then("^Added items should be displayed in the trolly$")
	public void added_items_should_be_displayed_in_the_trolly() throws Throwable {
		driver.findElement(By.cssSelector("#trolley-summary-panel > div > div.span8.trolley-panel-summary._showTrolleySlideBox > a")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.id("id=\'trolley-summary-panel\'")).isSelected();
        driver.findElement(By.id("id=\'trolley-summary-panel\'")).click();
                 
	}

	@Then("^User should view and save the items successfully$")
	public void user_should_view_and_save_the_items_successfully() throws Throwable {
		driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#trolley-panel > div > div.trolley-totals.pull-right.row-fluid > div > div:nth-child(1) > a")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#trolley-container > div.trolley-control-panel-border > div > div.trolley-buttons.span5.mrow-fluid > div.mtext-right.span6.mspan6 > a")).click();   
	}

	@Then("^User should logout successfully$")
	public void user_should_logout_successfully() throws Throwable {
	    driver.findElement(By.cssSelector("#header-panel > div > div > div > div.span8.hidden-phone > ul > li:nth-child(4) > a")).click();
	    
	}

}