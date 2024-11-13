import java.util.List;
import java.util.stream.Collectors;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableSorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.setProperty("WebDriver.chrome.driver","C:/Users/User/Documents/Webdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementslist = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originalelements = elementslist.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedelements = originalelements.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalelements.equals(sortedelements));

	}

}