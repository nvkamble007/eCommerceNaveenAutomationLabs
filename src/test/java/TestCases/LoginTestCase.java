package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.Login;
import PageObjectModel.Register;
import Resource.BaseClass;
import Resource.constant;

public class LoginTestCase extends BaseClass {

	@Test
	public void Login() {
		
		//test=extent.createTest("login test case");

		Register rpo = new Register(driver);
		rpo.clickonaccount().click();

		Login lpo = new Login(driver);
		lpo.clickonLogin().click();
		lpo.enteremail().sendKeys(constant.email);
		lpo.enterpass().sendKeys(constant.password);
		lpo.clickonlogin().click();

	}

}
