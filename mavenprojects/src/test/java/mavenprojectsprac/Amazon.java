package mavenprojectsprac;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Amazon {
	WebDriver driver= new ChromeDriver();
	@BeforeTest
	public void signin() {
		
		driver.get("https://www.amazon.in/ref=ap_frn_logo");
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.partialLinkText("sign in"));
		ele1.click();
	}
	@Test
	public void signin1() {
		
		WebElement ele2=driver.findElement(By.name("email"));
		ele2.sendKeys("9322510785");
		
		WebElement ele3=driver.findElement(By.id("continue"));
		ele3.click();
		
		WebElement ele4=driver.findElement(By.name("password"));
		ele4.sendKeys("Aditi@2001");
		
		WebElement ele5=driver.findElement(By.id("signInSubmit"));
		ele5.click();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")))
		.sendKeys("realme narzo");
		
		WebElement ele6=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		ele6.click();
	
		WebElement ele7=driver.findElement(By.id("a-autoid-1-announce"));
		ele7.click();
		
		WebElement ele8=driver.findElement(By.id("nav-cart"));
		ele8.click();
		
		WebElement ele9=driver.findElement(By.name("proceedToRetailCheckout"));
		ele9.click();
		
		driver.close();
	}
	
	
	}


