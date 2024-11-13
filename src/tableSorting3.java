import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class tableSorting3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver","C:/Users/User/Documents/Webdrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<String> price;
		do
		{
	    List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
	    
		price = rows.stream().filter(s->s.getText().contains("Wheat")).map(s->getveggieprice(s)).collect(Collectors.toList());

		price.forEach(v->System.out.println(v));
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}
		while(price.size()<1);
	}

	private static String getveggieprice(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return pricevalue;
		
		


}}
