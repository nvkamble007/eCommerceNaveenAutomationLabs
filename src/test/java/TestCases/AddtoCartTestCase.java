package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.AddtoCart;
import Resource.BaseClass;
import Resource.CommonMethod;
import Resource.constant;

public class AddtoCartTestCase extends BaseClass {

	@Test
	public void addtocart() {
		
		//test=extent.createTest("login test case");

		AddtoCart obj = new AddtoCart(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to SearchBox

		obj.searchBox().sendKeys(constant.searchBox);
		obj.searchBT().click();

		// Selecting MacBook

		obj.clickOnItem().click();

		// Quantity input
		obj.inputQty().clear();
		obj.inputQty().sendKeys("2");

		// Adding item to the Cart

		obj.addToCart().click();

		// Fetching ATC Notification

		System.out.println("Notification:  " + obj.fetchNotification().getText());
		CommonMethod.softassert(obj.fetchNotification().getText(), obj.fetchNotification().getText());
		System.out.println("Text on AddToCart Button: " + obj.fetchATCText().getText());
		System.out.println("Prize of selected Item: " + obj.fetchPrize().getText());

		// Converting String Prize into double

		double ItemPrize = Double.parseDouble(obj.fetchPrize().getText().replace("$", ""));
		obj.clickOnATCBt().click();
		obj.clickViewCart().click();
		System.out.println("Total Prize in AddToCart: " + obj.totalPrize().getText());
		double TotalPrize = Double.parseDouble(obj.totalPrize().getText().replaceAll("[$,]", ""));
		System.out.println(TotalPrize);

		// Adding product Prize

		double sum = ItemPrize + ItemPrize;
		System.out.println(sum);

		// Comparing Product Prize

		if (TotalPrize == sum) {
			System.out.println("The Total Cart Value " + TotalPrize + " is same as Sum " + sum);
		}

	}
}
