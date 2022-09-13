package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Survey_submission {

	public static void main(String[] args) throws InterruptedException {
		

		   System.setProperty("webdriver.chrome.driver", "E:\\Browser drivers\\Chrome\\chromedriver.exe");
		   String baseURL = "https://app.staging.engagerocket.co/engagement/participant/answers_submission/new?survey_user_identity=1f9658d362f28a3d18699c03151e8093";   
			  WebDriver ER = new ChromeDriver();
			
			  ER.navigate().to(baseURL);
		      ER.manage().window().maximize();
		
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/input[3]")).click();
		      //next page
		      
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[3]/div/div[3]/div/div/div[1]/label")).click(); //1st
		      Thread.sleep(2000);
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[5]/div/div[3]/div/div/div[1]/label")).click(); //2nd
		      Thread.sleep(2000);
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[7]/div/div[3]/div/div/div[1]/label")).click(); //3rd
		      Thread.sleep(2000);
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[9]/div/div[3]/div/div/div[1]/label")).click(); //4th
		      Thread.sleep(2000);
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[11]/div/div[3]/div/div/div[1]/label")).click(); //5th
		      Thread.sleep(2000);
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[13]/div/div[3]/div/div/div[1]/label")).click(); //6th
		      Thread.sleep(2000);
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[15]/div/div[3]/div/div/div[1]/label")).click(); //7th
		      Thread.sleep(2000);
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[17]/div/div[3]/div/div/div[1]/label")).click(); //8th
		      Thread.sleep(2000);
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[19]/div/div[3]/div/div/div[1]/label")).click(); //9th
		      Thread.sleep(2000);
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[21]/div/div[3]/div/div/div[1]/label")).click(); //10th
		      Thread.sleep(2000);
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[23]/div/div[3]/div/div/div[1]/label")).click(); //11th
		      Thread.sleep(2000);
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[25]/div/div[3]/div/div/div[1]/label")).click(); //12th
		      Thread.sleep(2000);
		      ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[27]/div/div[3]/div/div/div[1]/label")).click(); //13th
		      Thread.sleep(2000);
	          ER.findElement(By.xpath("//*[@id=\"questionnaire_form_question_fields_attributes_13_answer_content\"]")).sendKeys("xyz"); //open-ended
	          Thread.sleep(2000);
	          
	          ER.findElement(By.xpath("//*[@id=\"new_questionnaire_form\"]/div[30]/div/input")).click();
	

	}

}
