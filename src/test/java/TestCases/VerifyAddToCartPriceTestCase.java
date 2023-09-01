package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.AddToCartPrice;
import Resource.BaseClass;
import Resource.constant;

public class VerifyAddToCartPriceTestCase extends BaseClass {

	@Test
	public void verifycartprice() {
		
		//test=extent.createTest("login test case");

		AddToCartPrice obj = new AddToCartPrice(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to SearchBox
		obj.clicksearchBox().sendKeys("iphone");
		obj.clicksearchBT().click();

		// Selection of Item and Item Price,Add to cart
		List<WebElement> p = obj.selectItem();
		constant.iElement = "";
		for (int i = 0; i < p.size(); i++) {
			constant.iText = p.get(i).getText();
			if (constant.iText.equalsIgnoreCase(constant.iphoneItem)) {
				constant.iElement = obj.selectPrice().get(i).getText();

				obj.clickaddToCart().click();

				break;
			}

		}

		// Converting String Prize into double
		String[] iphcost = constant.iElement.split("\\s");
		double iphonePrice = Double.parseDouble(iphcost[0].replaceAll("[$,]", ""));
		System.out.println("Price of iPhone is:  " + iphonePrice);

		// For clearing of data
		obj.clicksearchBox().clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to Searchbox
		obj.clicksearchBox().sendKeys(constant.ssearchBox);
		obj.clicksearchBT().click();

		// Selection Of Item and Item Price,AddtoCart
		List<WebElement> k = (List<WebElement>) obj.selectItem();
		constant.sElement = "";
		for (int i = 0; i < k.size(); i++) {
			constant.sText = k.get(i).getText();
			if (constant.sText.equalsIgnoreCase(constant.samsungItem)) {
				constant.sElement = obj.selectPrice().get(i).getText();

				obj.clickaddToCart().click();

				break;
			}
		}

		// Converting Price to double
		String[] samcost = constant.sElement.split("\\s");
		double samsungPrice = Double.parseDouble(samcost[0].replaceAll("[$,]", ""));
		System.out.println("Price of Samsung is:  " + samsungPrice);

		double totalcost = iphonePrice + samsungPrice;

		// Converting Total Price to String
		String totalPrice = "$" + String.valueOf(totalcost);
		System.out.println("Total Price is:  " + totalPrice);

		// Converting carts Total Price to double
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.clickaddToCartBT().click();
		double cartcost = Double.parseDouble(obj.selecttotalPrice().getText().replaceAll("[$,]", ""));

		// Converting Price to String
		String cartPrice = "$" + String.valueOf(cartcost);
		System.out.println("Total Cart Price is:  " + cartPrice);

		if (totalPrice.equalsIgnoreCase(cartPrice)) {
			System.out.println(constant.matchedPrice);

		} else {
			System.out.println(constant.unmatchedPrice);

		}

	}

}
