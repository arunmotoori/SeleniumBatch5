package commandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDemo {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Rectangle rect = driver.findElement(By.id("ta1")).getRect();
		System.out.println(rect.height);
		System.out.println(rect.width);
		System.out.println(rect.x);
		System.out.println(rect.y);
		
//		String buttonColor = driver.findElement(By.className("dropbtn")).getCssValue("background-color");
//		System.out.println(buttonColor);
		
//		String elementTag = driver.findElement(By.xpath("//input[@value='Bike']")).getTagName();
//		System.out.println(elementTag);
		
//		String pageHTMLCode = driver.getPageSource();
//		System.out.println(pageHTMLCode);
		
//		boolean bikeStatus = driver.findElement(By.xpath("//input[@value='Bike']")).isSelected();
//		System.out.println(bikeStatus);
//		
//		boolean bicycleStatus = driver.findElement(By.xpath("//input[@value='Bicycle']")).isSelected();
//		System.out.println(bicycleStatus);
//	
//		driver.navigate().to("https://www.qafox.com/");
//		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
		
		driver.quit();
		
	}
}
