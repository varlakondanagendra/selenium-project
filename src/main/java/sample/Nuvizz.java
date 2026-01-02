package sample;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nuvizz {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String ExpectedURL = "https://loginqa.nuvizz.com/loginreg/#/";
		String ExpectedTitle = "nuVizz Login";
		driver.get(ExpectedURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		String ActualURL = driver.getCurrentUrl();
		if(ActualURL.equals(ExpectedURL)) {
			System.out.println("URL Test Passed");
			System.out.println(ActualURL);
			System.out.println(ExpectedURL);
		}
		else {
			System.out.println("URL Test Failed");
			System.out.println(ActualURL);
			System.out.println(ExpectedURL);
		}
		String ActualTitle =driver.getTitle();
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		String companyLogoxpath = "//img[@alt='logo']";
		boolean LogoDisplayed = driver.findElement(By.xpath(companyLogoxpath)).isDisplayed();
		if(LogoDisplayed) {
			System.out.println("Logo is displayed - Test Passed");
		}
		else {
			System.out.println("Logo is not displayed - Test Failed");
		}
		String pageHeaderTitlexpath = "//div[text()='Transportation Management Portal']";
		boolean pageHeaderDisplayed = driver.findElement(By.xpath(pageHeaderTitlexpath)).isDisplayed();
		if(pageHeaderDisplayed) {
			System.out.println("Page Header is displayed - Test Passed");
		}
		else {
			System.out.println("Page Header is not displayed - Test Failed");
		}
		
		String companycodeTextfeild = "companyCode";
		driver.findElement(By.id(companycodeTextfeild)).sendKeys("FF");
		String proceedButtonxpath = "//span[text()='Proceed']";
		driver.findElement(By.xpath(proceedButtonxpath)).click();
		String usernameTextFeild = "userName";
		String username = "Chaan";
		driver.findElement(By.id(usernameTextFeild)).sendKeys(username);
		String passwordTextFeild = "password";
		String password = "P@ssw0rd";
		driver.findElement(By.id(passwordTextFeild)).sendKeys(password);
		String loginbuttonXpath = "//span[text()='Login']";
		driver.findElement(By.xpath(loginbuttonXpath)).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		String SpinnerIconXpath = "//*[@role=\"status\"]";
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(SpinnerIconXpath)));
		String HomeBreadCrumbXpath = "//b[text()='Home']";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomeBreadCrumbXpath)));
		boolean HomeBreadCrumbDisplayed = driver.findElement(By.xpath(HomeBreadCrumbXpath)).isDisplayed();
		if(HomeBreadCrumbDisplayed) {
			System.out.println("Login Test Passed");
		}
		else {
			System.out.println("Login Test Failed");
		}
		String MenusliderSettingsXpath = "//div[@class=\"menu-sidebar\"]/div/div/div/div/div/div/div/ul/li//a//p[text()='Settings']";
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(MenusliderSettingsXpath))).perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MenusliderSettingsXpath)));
		//driver.findElement(By.xpath(MenusliderSettingsXpath)).click();
		String orderprofileMenuXpath = "//span[@title=\"Order Profile\"]";
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(orderprofileMenuXpath)));
		driver.findElement(By.xpath(orderprofileMenuXpath)).click();
		String oderProfileBrucrumbXpath = "//span[text()=\"Order Profile\"]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(oderProfileBrucrumbXpath)));
		boolean orderProfileBrucrumbDisplayed = driver.findElement(By.xpath(oderProfileBrucrumbXpath)).isDisplayed();
		if(orderProfileBrucrumbDisplayed) {
			System.out.println("Navigation to Order Profile Page Test Passed");
		}
		else {
			System.out.println("Navigation to Order Profile Page Test Failed");
		}
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		//driver.quit();
		
		
		
	}

}
