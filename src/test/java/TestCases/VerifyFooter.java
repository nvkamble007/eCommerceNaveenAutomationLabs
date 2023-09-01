package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.Footer;
import Resource.BaseClass;

public class VerifyFooter extends BaseClass {

	@Test
	public void footer() throws Exception {
		
		//test=extent.createTest("login test case");

		// This code checks all the links are click able or not
		// test=extent.createTest("login test case");
		Footer obj = new Footer(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		obj.linktofooter().click();
		for (int i = 0; i < obj.noOfLink().size(); i++) {

			System.out.println("Link: " + obj.noOfLink().get(i).getText());
			obj.noOfLink().get(i).click();

			if (obj.noOfLink().get(i).isEnabled()) {
				System.out.println("Link Clickable= " + obj.noOfLink().get(i).isEnabled());
			} else {
				System.out.println("Link not clickable= " + obj.noOfLink().get(i).isEnabled());
			}
		}
	}
}
