package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ForgotPassword {
	
	public WebDriver driver;
	@FindBy(id="email")
	WebElement Femail;

	@FindBy(id="did_submit")
	WebElement Fsearch;

	public ForgotPassword(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}	
}
