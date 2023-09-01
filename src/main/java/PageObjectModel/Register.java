package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {

	public WebDriver driver;

	private By account = By.xpath("//span[@class='caret']");
	private By register=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/register']");
	private By firstname = By.xpath("//input[@name='firstname']");
	private By lastname = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By confirm = By.xpath("//input[@name='confirm']");
	private By agree = By.xpath("//input[@type='checkbox']");
	

	public Register(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement clickonaccount() {
		return driver.findElement(account);
	}

	public WebElement clickonregister() {
		return driver.findElement(register);
	}

	public WebElement enterfirstname() {
		return driver.findElement(firstname);
	}

	public WebElement enterlastname() {
		return driver.findElement(lastname);
	}

	public WebElement enteremail() {
		return driver.findElement(email);
	}

	public WebElement entertelephone() {
		return driver.findElement(telephone);
	}

	public WebElement enterpassword() {
		return driver.findElement(password);
	}

	public WebElement confirmpassword() {
		return driver.findElement(confirm);
	}

	public WebElement clickonagree() {
		return driver.findElement(agree);
	}

}
