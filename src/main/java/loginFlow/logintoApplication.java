package loginFlow;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintoApplication {
	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		String actualURL = "https://www.google.com/";
		driver.get(actualURL);
		String expectedUrl ;
		expectedUrl  = driver.getCurrentUrl();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		expectedUrl  = driver.getCurrentUrl();
		System.out.println(expectedUrl);
		boolean ismatches = actualURL.matches(expectedUrl);
		System.out.println(ismatches);
		driver.quit();
	}

}
