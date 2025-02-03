package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Page_Objects.searchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class searchTest {
	WebDriver driver;
	searchPage searchPage;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com");
		searchPage = new searchPage(driver);
	}

	@Test
	public void testSearchFunctionality() throws InterruptedException {
		searchPage.searchProduct("Fusion Backpack");
		Assert.assertTrue(searchPage.verifySearchResult("Fusion Backpack"), "Product not found in search results!");
		Thread.sleep(2000);

		// Using JavaScriptExecutor to scroll down by 500 pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
