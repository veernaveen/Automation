import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tableSorting4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("WebDriver.chrome.driver","C:/Users/User/Documents/Webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(2000);
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> cha = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> veg = cha.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(cha.size(), veg.size());
	    
	}

}
