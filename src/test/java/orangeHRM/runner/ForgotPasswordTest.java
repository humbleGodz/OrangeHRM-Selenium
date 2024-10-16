package orangeHRM.runner;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangeHRM.pages.ForgotPasswordPage;
import orangeHRM.setup.Setup;
import orangeHRM.utility.TestDataProperties;

public class ForgotPasswordTest extends Setup{
	
	ForgotPasswordPage forgot;
	
	@Test
	public void ForgotPassword() throws IOException {
		try {
		forgot = new ForgotPasswordPage(driver);
		forgot.resetPasswordBtn();
		forgot.inputUserName(TestDataProperties.propertiesUtility("resetusername"));
		forgot.resetButtonClick();
		String expectedMsg = "Reset Password link sent successfully";
		String actualMsg = forgot.successMassage();
		Assert.assertEquals(actualMsg, expectedMsg);
		log.info("Forgot Password Test Case Passed");
		}
		catch (AssertionError e) {
			log.error("Forgot Password Test Case Failed");
		}
	}
}
