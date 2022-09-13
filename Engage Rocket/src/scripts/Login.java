package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\Browser drivers\\Chrome\\chromedriver.exe");
		   String baseURL = "https://auth.staging.engagerocket.co/?return_url=https://app.staging.engagerocket.co/engagement/dashboard?";   
			  WebDriver ER = new ChromeDriver();
			
			  ER.navigate().to(baseURL);
		      ER.manage().window().maximize();
		      Thread.sleep(2000);
		         
		         ER.findElement(By.xpath("//*[@id='email']")).sendKeys("isar_gangwani@engagerocket.co");
		         ER.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test@123456");
		         Thread.sleep(1000);
		         
		         
		         ER.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/form/div[4]/div/button")).click();
		    
		

	}

}
