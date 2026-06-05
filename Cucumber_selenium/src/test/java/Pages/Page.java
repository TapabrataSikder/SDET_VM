package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	WebDriver driver;
	WebDriverWait wait;
	
	By user = By.name("username");
	By pass = By.name("password");
	By submit = By.xpath("//input[@value='Log In']");
	
	
	public Page(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void login(String username, String password, String status) throws InterruptedException {
		driver.findElement(user).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(submit).click();
		System.out.println("Status= "+status);
	}
	
	
	private By regLink = By.linkText("Register");
	private By firstName = By.id("customer.firstname");
	private By lastName = By.id("customer.lastName");
	private By address = By.id("RegistrationPage");
	private By city = By.id("customer.address.city");
	private By state = By.id("customer.address.state");
	private By zip = By.id("customer.address.zipCode");
	private By phone = By.id("customer.phoneNumber");
	private By ssnField = By.id("customer.ssn");
	private By username = By.id("customer.username");
	private By password = By.id("customer.password");
	private By cnfpassword = By.id("repeatedPassword");
	private By registerButton = By.xpath("//input[@value='Register']");
	
	public void register(String fname, String lname, String adr, String cty, String st, String zp, String phn, String ssnNum, String user, String pwd, String cnfpwd) {
		wait.until(ExpectedConditions.elementToBeClickable(regLink)).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(fname);
		driver.findElement(lastName).sendKeys(lname);
		driver.findElement(address).sendKeys(adr);
		driver.findElement(city).sendKeys(cty);
		driver.findElement(state).sendKeys(st);
		driver.findElement(zip).sendKeys(zp);
		driver.findElement(phone).sendKeys(phn);
		driver.findElement(ssnField).sendKeys(ssnNum);
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(cnfpassword).sendKeys(cnfpwd);
		driver.findElement(registerButton).click();
	
	
	}
}
