package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.ContactUsForm;
import Resource.BaseClass;
import Resource.constant;

public class ContactUsFormTestCase extends BaseClass {

	@Test
	public void contactusform() {
		
		//test=extent.createTest("login test case");

		ContactUsForm obj = new ContactUsForm(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.contactUs().click();
		obj.name().sendKeys(constant.name);
		obj.email().sendKeys(constant.useremail);
		obj.enquiry().sendKeys(constant.enquiry);
		obj.submitBT().click();
		System.out.println(obj.fetchNotification().getText());
	}

}
