package roughtest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Elementrepo.LoginPage;
public class LoginTestcasess extends BaseClass {
	//WebDriver driver;
	LoginPage lp;
	List<String> loginList;

	@Test
	public void verifyLoggedUsers() {
		lp = new LoginPage(driver);
		loginList = lp.getLoginDetails();
		System.out.println(loginList);
		lp.getUserName(loginList.get(0));
		lp.getPassWord(loginList.get(1));
		/*
		 * lp.enterUserName("admin"); lp.enterPassWord("admin");
		 */
		lp.clickSignin();
		String actual = lp.profileVerification();
		String expected = "admin";
		Assert.assertEquals(expected, actual, "Admin Name is not as we expected");

	}

}
