package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_pulse_survey {

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
		         Thread.sleep(2000);
		    
		         ER.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div")).click();
		         
		         
		         ER.findElement(By.xpath("//*[@id=\"entity-index-page\"]/div/div[2]/a")).click();
		         Thread.sleep(2000);
		         
		         ER.findElement(By.xpath("//*[@id=\"product-selection-page\"]/div/div[2]/a[1]")).click();
		         Thread.sleep(2000);
		         
		         ER.findElement(By.xpath("/html/body/div[2]/header/div[1]/nav/ul/li[3]/a")).click();        
		         Thread.sleep(1000);
		
		         //edit recipients>> 
		         ER.findElement(By.xpath("//*[@id=\"survey-main-page\"]/div[2]/div[1]/table/tbody/tr[7]/td[5]/div/span/a")).click();
		         Thread.sleep(1000);
		         ER.findElement(By.xpath("//*[@id=\"recipients-page\"]/div[1]/div[6]/div[2]/div[1]")).click();
		         Thread.sleep(1000);
		         ER.findElement(By.xpath("//*[@id=\"go-back\"]")).click();
		         Thread.sleep(2000);
		         		         
		         //edit scheduling
		         ER.findElement(By.xpath("//*[@id=\"survey-main-page\"]/div[2]/div[1]/table/tbody/tr[7]/td[6]/div/div/div[1]/div")).click();
		         Thread.sleep(1000);
		         ER.findElement(By.xpath("//*[@id=\"survey-main-page\"]/div[2]/div[1]/table/tbody/tr[7]/td[6]/div/div/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div[1]/input")).click();
		         Thread.sleep(1000);
		         ER.findElement(By.xpath("//*[@id=\"survey-main-page\"]/div[2]/div[1]/table/tbody/tr[7]/td[6]/div/div/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[2]/td[5]")).click();
		         Thread.sleep(1000);
		         ER.findElement(By.xpath("//*[@id=\"survey-main-page\"]/div[2]/div[1]/table/tbody/tr[7]/td[6]/div/div/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div[2]/div")).click();
		         Thread.sleep(1000);
		         ER.findElement(By.xpath("//*[@id=\"survey-main-page\"]/div[2]/div[1]/table/tbody/tr[7]/td[6]/div/div/div[3]/div/div/div/div/div[3]/div")).click();
		         Thread.sleep(2000);
		         
		         
		         //edit questionnaire>>
		         ER.findElement(By.xpath("//*[@id=\"survey-main-page\"]/div[2]/div[1]/table/tbody/tr[7]/td[4]/div/span/a")).click();
		         Thread.sleep(1000);
		         ER.findElement(By.xpath("//*[@id=\"question-library-container\"]/div[1]/button[2]")).click();
		         Thread.sleep(2000);
		         ER.findElement(By.xpath("//*[@id=\"question-library-container\"]/div[3]/div[3]/div[1]")).click();
		         Thread.sleep(1000);
		         ER.findElement(By.xpath("//*[@id=\"question-library-container\"]/div[3]/div[3]/div[2]/div[1]/div[2]/i")).click();
		         Thread.sleep(2000);
		         ER.findElement(By.xpath("//*[@id=\"go-back\"]"));  //last code not executing
		         

	}

}
