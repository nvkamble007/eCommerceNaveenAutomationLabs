package Resource;

import org.testng.asserts.SoftAssert;

public class CommonMethod {

	public static void softassert(String actualstring, String expectedstring) {

		SoftAssert assertion = new SoftAssert();
		String actual = actualstring;
		String expected = expectedstring;
		assertion.assertEquals(actual, expected);
		assertion.assertAll();

	}
}