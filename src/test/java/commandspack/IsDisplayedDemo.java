package commandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedDemo {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//boolean button2Status = driver.findElement(By.id("but2")).isDisplayed();
		boolean button2Status = driver.findElement(By.id("but2")).isEnabled();
		System.out.println(button2Status);
		
		//boolean button1Status = driver.findElement(By.id("but1")).isDisplayed();
		boolean button1Status = driver.findElement(By.id("but1")).isEnabled();
		System.out.println(button1Status);
		
//		boolean buttonStatus = driver.findElement(By.id("hbutton")).isDisplayed();
//		System.out.println(buttonStatus);
		
		driver.quit();
	}

}
