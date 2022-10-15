package org.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	private WebDriver driver;

	@FindBy(id = "email")
	private WebElement uNTxtField;

	@FindBy(name = "password")
	private WebElement pwdTxtField;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginBtn;

	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotpassowordlink;
	
	@FindBy(linkText = "Click here to signup")
	private WebElement signupbtn;
	
	@FindBy(linkText = "Signup")
	private WebElement signuplink;
	
	@FindBy(xpath = "//img[@src='/images/logo_wishup.png']")
	private WebElement wishupimglink;
	
	@FindBy(linkText = "Login")
	private WebElement loginlink;
	
	@FindBy(xpath = "//img[@src='https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Google_%22G%22_Logo.svg/512px-Google_%22G%22_Logo.svg.png']")
	private WebElement singnInwithgooglelink;
	
	@FindBy(xpath = "//label[text()='Email address']")
	private WebElement emaillabel;
	
	@FindBy(xpath = "//label[text()='Password']")
	private WebElement passwordlabel;
	
	@FindBy(xpath = "//h1[text()='Login']")
	private WebElement loginlabel;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}




	public void enterUseName(String uName) {
		uNTxtField.sendKeys(uName);
	
	}

	public void enterPassword(String pwd) {
		pwdTxtField.sendKeys(pwd);
		
	}

	public void clickLoginButton() {
		loginBtn.click();
	}

	public void forgotpasslinkwork()
	{
		forgotpassowordlink.click();
				
	}
	
	public void clickOnSignup()
	{
		signupbtn.click();
		
	}
	
	public boolean isUserNameFieldDisplayed()
	{
		
		return uNTxtField.isDisplayed(); 
		
	}
	
	public boolean isPasswordFieldDisplayed()
	{
		
		return pwdTxtField.isDisplayed(); 
		
	}
	
	public boolean isLoginBtnDisplayed()
	{
		
		return loginBtn.isDisplayed(); 
		
	}
	
	public boolean isForgotPassLinkDisplayed()
	{
		
		return forgotpassowordlink.isDisplayed(); 
		
	}
	
	public boolean isSignupBtnDisplayed()
	{
		
		return signupbtn.isDisplayed(); 
		
	}
	
	
	public boolean isSignupLinkDisplayed()
	{
		
		return signuplink.isDisplayed(); 
		
	}
	
	public boolean isWishupImgLinkDisplayed()
	{
		
		return wishupimglink.isDisplayed(); 
		
	}
	
	public boolean isLoginLinkDisplayed()
	{
		
		return loginlink.isDisplayed(); 
		
	}
	
	public boolean isSignInwithGoogleLinkDisplayed()
	{
		
		return singnInwithgooglelink.isDisplayed(); 
		
	}
	
	public boolean isEmailLabelDisplayed()
	{
		
		return emaillabel.isDisplayed(); 
		
	}
	
	public boolean isPasswordLabelDisplayed()
	{
		
		return passwordlabel.isDisplayed(); 
		
	}
	
	
	public boolean isLoginLabelisplayed()
	{
		
		return loginlabel.isDisplayed(); 
		
	}
	

	public void clickOnSignInWithGoogleLink()
	{
		
		singnInwithgooglelink.click(); 
		
	}
	
	
	public void clickOnSignUpBtn()
	{
		
		signupbtn.click(); 
		
	}
	
	
	public void clickOnSignUpLink()
	{
		
		signuplink.click(); 
		
	}

}
