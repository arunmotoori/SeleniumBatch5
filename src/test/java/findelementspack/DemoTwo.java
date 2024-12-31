package findelementspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwo {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	
		int s = driver.findElements(By.xpath("//div[@id='LinkList1']//a")).size();
		
		for(int i=1;i<=s;i++) {
			String xpathText = "(//div[@id='LinkList1']//a)["+i+"]";
			WebElement link = driver.findElement(By.xpath(xpathText));
			link.click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
		}
		
		driver.quit();
		
	
// StaleElementReferenceException		
//		List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
//		
//		for(WebElement link : links) {
//			
//			link.click();
//			driver.getTitle();
//			driver.navigate().back();
//			
//		}
		
	
		driver.quit();
	
	}

}
