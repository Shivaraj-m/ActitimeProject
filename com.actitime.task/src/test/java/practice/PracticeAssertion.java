package practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeAssertion {
	@Test
	public void test() {
		int a = 20;
		int b = 20;
		Assert.assertTrue(a==b,"Assert MSG : FAIL");
		Reporter.log("PASS", true);
	}
}
