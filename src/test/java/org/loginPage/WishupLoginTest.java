package org.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
// Test cases for Wishup Login page

public class WishupLoginTest {


	private WebDriver driver;

	
	@BeforeMethod
	public void openURL() {
		String url = "https://app-dev.wishup.co/";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Test(dataProvider = "testData" ,priority=12)

	public void loginWishup(String uname, String password, String scenario) 
	{
		LoginPage lp_obj = new LoginPage(driver);

		lp_obj.enterUseName(uname);
		lp_obj.enterPassword(password);
		lp_obj.clickLoginButton();
		
		if(scenario.equals("incorrect")) {
		Assert.assertFalse(driver.findElement(By.linkText("reset your password")).isDisplayed());
				
	}
		else 
		{
			Assert.assertTrue(true);
			
			}
		}

	@Test
	public void testLoginPageUrl()
	{
		driver.get("https://app-dev.wishup.co/login");
		Assert.assertEquals(driver.getCurrentUrl(),"https://app-dev.wishup.co/login");

	}




	@Test
	public void testSignupbtn()
	{
		LoginPage lp_obj = new LoginPage(driver);

		lp_obj.clickOnSignup();
		String expurl="https://app-dev.wishup.co/signup?redirect=/";
		Assert.assertEquals(driver.getCurrentUrl(), expurl);
	}

	@Test(priority=0)
	public void testisUserNameFieldDisplayed()
	{
		LoginPage lp_obj = new LoginPage(driver);

		boolean h=lp_obj.isUserNameFieldDisplayed();

		Assert.assertTrue(h);
	}
	@Test(priority=1)
	public void testispasswordFielDisplayed()
	{
		LoginPage lp_obj = new LoginPage(driver);

		boolean pass=lp_obj.isPasswordFieldDisplayed();

		Assert.assertTrue(pass);
	}
	@Test(priority=2)
	public void testisLoginBtnDisplayed()
	{
		LoginPage lp_obj = new LoginPage(driver);

		boolean loginbtn=lp_obj.isLoginBtnDisplayed();

		Assert.assertTrue(loginbtn);
	}
	@Test(priority=3)
	public void testisForgotPassLinkDisplayed()
	{
		LoginPage lp_obj = new LoginPage(driver);

		boolean forgotpasslink=lp_obj.isForgotPassLinkDisplayed();

		Assert.assertTrue(forgotpasslink);
	}

	@Test(priority=4)
	public void testisSingnupBtnDisplayed()
	{
		LoginPage lp_obj = new LoginPage(driver);

		boolean signupbtn=lp_obj.isSignupBtnDisplayed();

		Assert.assertTrue(signupbtn);
	}

	@Test(priority=5)
	public void testisSingnupLinkDisplayed()
	{
		LoginPage lp_obj = new LoginPage(driver);

		boolean signuplink=lp_obj.isSignupLinkDisplayed();

		Assert.assertTrue(signuplink);
	}

	@Test(priority=6)
	public void testisWishupImgLinkDisplayed()
	{
		LoginPage lp_obj = new LoginPage(driver);

		boolean wishupimglink=lp_obj.isWishupImgLinkDisplayed();

		Assert.assertTrue(wishupimglink);
	}
	@Test(priority=7)
	public void testisLoginLinkDisplayed()
	{
		LoginPage lp_obj = new LoginPage(driver);

		boolean loginlink=lp_obj.isLoginLinkDisplayed();

		Assert.assertTrue(loginlink);
	}

	@Test(priority=8)
	public void testisSignInwithGoogleLinkDisplayed()
	{
		LoginPage lp_obj = new LoginPage(driver);

		boolean signgooglelink=lp_obj.isSignInwithGoogleLinkDisplayed();

		Assert.assertTrue(signgooglelink);
	}

	@Test(priority=9)
	public void testisEmailLabelDisplayed()
	{
		LoginPage lp_obj = new LoginPage(driver);

		boolean emaillabel=lp_obj.isEmailLabelDisplayed();

		Assert.assertTrue(emaillabel);
	}

	@Test(priority=10)
	public void testisPasswordLabelDisplayed()
	{
		LoginPage lp_obj = new LoginPage(driver);

		boolean passwordlabel=lp_obj.isPasswordLabelDisplayed();

		Assert.assertTrue(passwordlabel);
	}

	@Test(priority=11)
	public void testisLoginLabelDisplayed()
	{
		LoginPage lp_obj = new LoginPage(driver);

		boolean Loginlabel=lp_obj.isLoginLabelisplayed();

		Assert.assertTrue(Loginlabel);
	}

	@Test
	public void testSignInWithGoogleLink()
	{
		LoginPage lp_obj = new LoginPage(driver);

		lp_obj.clickOnSignInWithGoogleLink();

		Assert.assertEquals(driver.getCurrentUrl(),"https://accounts.google.com/o/oauth2/v2/auth/identifier?response_type=code&redirect_uri=https%3A%2F%2Fapp-dev.wishup.co%2Fauth%2Fgoogle%2Fcallback&scope=email%20profile&client_id=584359031459-ev6395v28rja7rg9s501jmi9ln70c1o9.apps.googleusercontent.com&flowName=GeneralOAuthFlow");
	}

	@Test
	public void testForgotPassLink()
	{
		LoginPage lp_obj = new LoginPage(driver);
		lp_obj.forgotpasslinkwork();
		Assert.assertEquals(driver.getCurrentUrl(),"https://app-dev.wishup.co/forgot");
	}

	@Test
	public void testSignUpBtn()
	{
		LoginPage lp_obj = new LoginPage(driver);
		lp_obj.clickOnSignUpBtn();
		Assert.assertEquals(driver.getCurrentUrl(),"https://app-dev.wishup.co/signup?redirect=/");
	}


	@Test
	public void testSignUpLink()
	{
		LoginPage lp_obj = new LoginPage(driver);
		lp_obj.clickOnSignUpLink();
		Assert.assertEquals(driver.getCurrentUrl(),"https://app-dev.wishup.co/signup");
	}





	@DataProvider
	public Object[][] testData() {
		Object data[][] = {

			{ "wishup_testuser1@gmail.com", "testpw1","correct" }, 
				{ "wishup_testuser2@gmail.com", "testpw2" ,"incorrect"},
			{ "wishup_testuser3@gmail.com", "testpw3","correct" }, 
				{ "wishup_testuser4@gmail.com", "testpw4","correct" }

		};
		return data;
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}


}
