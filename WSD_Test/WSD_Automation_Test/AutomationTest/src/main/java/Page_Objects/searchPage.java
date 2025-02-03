package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPage {
    WebDriver driver;

    public searchPage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchBox = By.id("search");
    private By searchButton = By.xpath("//button[@title='Search']");

    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    public boolean verifySearchResult(String productName) {
        return driver.getPageSource().contains(productName);
    }
}