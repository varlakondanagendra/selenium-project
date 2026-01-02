package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToApplication {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String signInURL = "https://sg-app.fireflink.com/";
		String ExpectedTitle = "FireFlink";
		driver.get(signInURL);
		String actualTitle = driver.getTitle();
		boolean iscontains = actualTitle.contains(ExpectedTitle);
		System.out.println(iscontains);
		System.out.println("Page Title is: " + actualTitle);
		int implicitTime = 10000  ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTime));
		String CurrentURL=driver.getCurrentUrl();
		boolean isContains = signInURL.contains(CurrentURL);
		System.out.println("Current URL Matches with Expected is " + isContains);
		String FireFLinkLogo = "(//span[@class='ff-icon-container'])[1]";
		String signinText = "//span[text()='Sign In']";
		WebElement isDIsplayed ;
		isDIsplayed = driver.findElement(By.xpath(FireFLinkLogo));
		System.out.println("FireFLink Logo Displayed");
		String exmailTextfeildLocator = "email";
		String PasswordTextfeildLocator = "password";
		String email = "nagendra.k@fireflink.com";
		String password = "Nagendra@123";
		driver.findElement(By.id(exmailTextfeildLocator)).sendKeys(email);
		driver.findElement(By.id(PasswordTextfeildLocator)).sendKeys(password);
		String SignInButtonXpath = "//button[@type='submit']";
		driver.findElement(By.xpath(SignInButtonXpath)).click();
		
		
		
		
		
		

	}

}
