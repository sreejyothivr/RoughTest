package roughtest;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import Elementrepo.Dashboard;
import Elementrepo.LoginPage;
import io.netty.util.Constant;
import utilities.GeneralUtilities;

public class DaashBoardTest extends BaseClass  {
	 
	
		GeneralUtilities go = new GeneralUtilities();
		LoginPage lp;
		Dashboard dp;
	
		@Test
	
		public void Manageorders_search_btn_size() throws InterruptedException {
			lp = new LoginPage(driver);
			dp = new Dashboard(driver);
			lp.presteps();
			String actual = dp.displayTabName();
	
			String expected = "Dashboard";
			System.out.println(actual);
			Assert.assertEquals(actual, expected,"not equal");
	
		}
	
		@Test
		public void tableHeaderFieldValidation() {
			dp = new Dashboard(driver);
			lp = new LoginPage(driver);
			lp.presteps();
			dp.clickMoreinfoManagePages();
			List<String> tableheaders = dp.getTableValues();
			List<String> expectedtableheaders = dp.expectedTablevalues();
			boolean expected = true;
	
			boolean actual = dp.comaprison();
	
			Assert.assertEquals(actual, expected);
	
		}
	
	}

