package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	WebDriver driver = new ChromeDriver();

	private By Login = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']");
	private By email = By.xpath("//input[@id='input-email']");
	private By password = By.xpath("//input[@id='input-password']");
	private By login = By.xpath("//input[@value='Login']");

	public Login(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement clickonLogin() {
		return driver.findElement(Login);
	}

	public WebElement enteremail() {
		return driver.findElement(email);
	}

	public WebElement enterpass() {
		return driver.findElement(password);
	}

	public WebElement clickonlogin() {
		return driver.findElement(login);
	}

}
