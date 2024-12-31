package commandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndURLDemo {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		driver.findElement(By.linkText("jqueryui")).click();
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
		
		driver.quit();
		
	}

}
