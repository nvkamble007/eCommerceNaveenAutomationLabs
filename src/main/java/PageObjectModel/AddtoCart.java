package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {

	public WebDriver driver;

	private By searchBox = By.xpath("//input[@name='search']"); // searchbox
	private By searchBT = By.xpath("//button[@class='btn btn-default btn-lg']"); // searchbutton
	private By clickOnSelectedItem = By.xpath("//a[normalize-space()='MacBook']"); // click on macbook
	private By inputQty = By.xpath("//input[@id='input-quantity']"); // qty
	private By addToCart = By.xpath("//button[@id='button-cart']"); // addtocart
	private By fetchNotification = By.xpath("//div[@class='alert alert-success alert-dismissible']"); // notification
	private By fetchATCText = By.xpath("//span[@id='cart-total']"); // fetch from add to cart main button
	private By fetchPrize = By.xpath("(//ul[@class='list-unstyled'])[9]//li//h2"); // fetching price above qty
	private By ATCBt = By.xpath("(//button[@type='button'])[5]"); // click on main cart button
	private By clickViewCart = By.xpath("//strong[normalize-space()='View Cart']"); // click on view cart button
	private By totalPrize = By.xpath("(//tbody)[3]//tr//td[@class='text-right'][2]"); // total price from view cart
	private By checkOut = By.xpath("//a[@class='btn btn-primary']"); // click on checkout button
	

	public AddtoCart(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement searchBox() {
		return driver.findElement(searchBox);
	}

	public WebElement searchBT() {
		return driver.findElement(searchBT);
	}

	public WebElement clickOnItem() {
		return driver.findElement(clickOnSelectedItem);
	}

	public WebElement inputQty() {
		return driver.findElement(inputQty);
	}

	public WebElement addToCart() {
		return driver.findElement(addToCart);
	}

	public WebElement fetchNotification() {
		return driver.findElement(fetchNotification);
	}

	public WebElement fetchATCText() {
		return driver.findElement(fetchATCText);
	}

	public WebElement fetchPrize() {
		return driver.findElement(fetchPrize);
	}

	public WebElement clickOnATCBt() {
		return driver.findElement(ATCBt);
	}

	public WebElement clickViewCart() {
		return driver.findElement(clickViewCart);
	}

	public WebElement totalPrize() {
		return driver.findElement(totalPrize);
	}

	public WebElement clickOncheckOut() {
		return driver.findElement(checkOut);
	}

}