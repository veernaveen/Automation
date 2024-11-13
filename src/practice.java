import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		List<String> jin = Arrays.asList("amedkar","kali");
		
		List<String> cru = jin.stream().collect(Collectors.toList());
		
		System.out.println(cru.get(1));
		
		

	

	}

}
