package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HelperClass {
	public static Actions a;
	public static WebDriver driver ;
	public static void browserLaunch(String browser) {
		
		if (browser.equals("chrome")) {
			
			 driver = new ChromeDriver();
			
		}
		else if (browser.equals("Edge")) {

			 driver = new EdgeDriver();
			
		}
		else {
			
			 driver = new FirefoxDriver();
		}
		
	}
	
     public static void launchUrl(String url) {
		
    	 driver.get(url);
    	 
	}
	 public static void maximixeWindow() {
		
		driver.manage().window().maximize();
		
		
	}
	 public static void btnClick(WebElement clk) {
		
		 clk.click();
		 
	}
	 
	 public static void btnHover(WebElement source , WebElement target) {
		
		 a = new Actions(driver);
		 a.dragAndDrop(source, target);
		 
	}
	
	 
	 
	
	
}
