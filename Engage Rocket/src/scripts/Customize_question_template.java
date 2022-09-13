package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customize_question_template {

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
		         Thread.sleep(2000);
		      
		         ER.findElement(By.xpath("//*[@id=\"survey-main-page\"]/div[1]/a")).click();
		         Thread.sleep(1000);
		         
		         ER.findElement(By.xpath("//*[@id=\"survey-form-survey-name\"]")).sendKeys("testing.7x00cv2");
		         
		         ER.findElement(By.xpath("//*[@id=\"survey-submit-btn\"]")).click();
		         Thread.sleep(2000);
		         
		         ER.findElement(By.xpath("//*[@id=\"confirm-submit-form-popup\"]/div/div/div[2]/input")).click();
		         Thread.sleep(3000);
		         
		         //see Question Template Selection Modal if the Questionnaire is blank>>
		         ER.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div")).click();
		         Thread.sleep(2000);
		         
		         ER.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div[2]/button")).click();
		         Thread.sleep(2000);
		         ER.findElement(By.xpath("//*[@id=\"question-library-container\"]/div[1]/button[1]")).click();
		         
		         //replace all current questions with a Question Template>>
		         ER.findElement(By.xpath("//*[@id=\"question-library-container\"]/div[3]/div[4]/div/div")).click();
		         Thread.sleep(2000);
		         ER.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div[2]/button")).click();
		         Thread.sleep(2000);
		         ER.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div/div/button[1]")).click();
		         Thread.sleep(2000);
		         //all current questions replaced
		         
		         //add a Question Template to the currently existing questions>>
		         ER.findElement(By.xpath("//*[@id=\"question-library-container\"]/div[3]/div[3]/div")).click();
		         Thread.sleep(2000);
		         ER.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div[2]/button")).click();
		         Thread.sleep(2000);
		         ER.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div/div/button[2]")).click();
		         Thread.sleep(2000);
		         //template added to current questions
		         
		         //add question from Question Library
		         ER.findElement(By.xpath("//*[@id=\"question-library-container\"]/div[1]/button[2]")).click();
		         Thread.sleep(2000);
		         ER.findElement(By.xpath("//*[@id=\"question-library-container\"]/div[3]/div[3]/div[1]")).click();
		         Thread.sleep(2000);
		         ER.findElement(By.xpath("//*[@id=\"question-library-container\"]/div[3]/div[3]/div[2]/div[1]/div[2]/i")).click();
		         Thread.sleep(2000);
		         // 1 question added from library
		         
	}

}
