package commandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String text = driver.findElement(By.xpath("//input[@title='search'][@class='gsc-search-button']")).getDomAttribute("value");
		System.out.println(text);
		
		driver.quit();
		
	}

}
