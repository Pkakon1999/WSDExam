package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {
    WebDriver driver;

    // Constructor
    public cartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By cartItem = By.cssSelector(".product-item-name a");
    private By cartQuantity = By.cssSelector(".input-text.qty");
    private By cartPrice = By.cssSelector(".cart-price .price");
    private By removeItem = By.cssSelector(".action-delete");
    private By proceedToCheckout = By.cssSelector(".checkout-methods-items button");

    // Methods
    public String getProductName() {
        return driver.findElement(cartItem).getText();
    }

    public String getProductQuantity() {
        return driver.findElement(cartQuantity).getAttribute("value");
    }

    public String getProductPrice() {
        return driver.findElement(cartPrice).getText();
    }

    public void removeItemFromCart() {
        driver.findElement(removeItem).click();
    }

    public void proceedToCheckout() {
        driver.findElement(proceedToCheckout).click();
    }
}
