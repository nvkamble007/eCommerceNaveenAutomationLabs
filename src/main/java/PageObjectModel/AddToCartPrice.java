package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPrice {

	public WebDriver driver;

	private By searchBox = By.xpath("//input[@class='form-control input-lg']");
	private By searchBT = By.xpath("//button[@class='btn btn-default btn-lg']");
	private By selectItem = By.xpath("//h4");
	private By selectPrice = By.xpath("(//p[@class='price'])");
	private By addToCart = By.xpath("//div[@class='button-group']/button//i[@class='fa fa-shopping-cart']");
	private By addToCartBT = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
	private By totalPrice = By.xpath("(//td[@class='text-right'])[12]");

	public AddToCartPrice(WebDriver driver2) {
		this.driver=driver2;
	}


	public WebElement clicksearchBox() {
		return driver.findElement(searchBox);
	}

	public WebElement clicksearchBT() {
		return driver.findElement(searchBT);
	}

	public List<WebElement> selectItem() {
		return driver.findElements(selectItem);
	}

	public List<WebElement> selectPrice() {
		return driver.findElements(selectPrice);
	}

	public WebElement clickaddToCart() {
		return driver.findElement(addToCart);
	}

	public WebElement clickaddToCartBT() {
		return driver.findElement(addToCartBT);
	}

	public WebElement selecttotalPrice() {
		return driver.findElement(totalPrice);
	}

}
