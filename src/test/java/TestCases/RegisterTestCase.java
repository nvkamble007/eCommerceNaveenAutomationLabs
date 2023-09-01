package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import PageObjectModel.Register;
import Resource.BaseClass;
import Resource.constant;

public class RegisterTestCase extends BaseClass {

	@Test
	public void Register() throws InterruptedException {
		
		//test=extent.createTest("login test case");

		Register rpo = new Register(driver);
		rpo.clickonaccount().click();
		rpo.clickonregister().click();
		rpo.enterfirstname().sendKeys(constant.firstname);
		rpo.enterlastname().sendKeys(constant.lastname);
		rpo.enteremail().sendKeys(constant.email);
		rpo.enterpassword().sendKeys(constant.password);
		rpo.confirmpassword().sendKeys(constant.confirmpassword);
		rpo.clickonagree().click();

	}
}
