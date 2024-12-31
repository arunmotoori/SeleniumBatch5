package commandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {
	
	public static void main(String[] args) {
		
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://omayo.blogspot.com/");
	    
	     //driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");
	     //driver.findElement(By.name("q")).sendKeys("Arun Motoori");
	     //driver.findElement(By.className("dropbtn")).click();
	     //driver.findElement(By.linkText("jqueryui")).click();
	     driver.findElement(By.partialLinkText("jquery")).click();
	     //driver.findElement(By.xpath("//input[@value='Login']")).click();
	     //driver.findElement(By.cssSelector("input[value='Login']")).click();
	     
	
	}

}
