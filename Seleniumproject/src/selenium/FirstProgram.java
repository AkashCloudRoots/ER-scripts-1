package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FirstProgram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
		 WebDriver  ER = new ChromeDriver();
			  ER.get("https://app.staging.engagerocket.co/engagement/cycles/6866/dashboard/all_respondents?current_page=overview&page_action=all_respondents");
				// ER.navigate().to(baseURL);
			      ER.manage().window().maximize();
			      Thread.sleep(2000);
			      ER.findElement(By.xpath("//*[@id='email']")).sendKeys("isar_gangwani@engagerocket.co");
			       ER.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test@123456");
			       ER.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/form/div[4]/div/button")).click();
			       Thread.sleep(1000);
			     
			       ER.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div")).click();
			     
			     
			       ER.findElement(By.xpath("//*[@id=\"entity-index-page\"]/div/div[2]/a")).click();
			       Thread.sleep(2000);
			     
			       ER.findElement(By.xpath("//*[@id=\"product-selection-page\"]/div/div[2]/a[1]")).click();
			       Thread.sleep(2000);
			     
			       ER.findElement(By.xpath("/html/body/div[2]/header/div[1]/nav/ul/li[3]/a")).click();
			       Thread.sleep(1000);
			       Actions act= new Actions(ER);
			     
			       act.click(ER.findElement(By.xpath("//*[@id=\"survey-main-page\"]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div[1]/svg"))).perform();
			       Thread.sleep(1000);
			       act.click(ER.findElement(By.xpath("//*[@id=\"survey-main-page\"]/div[2]/div[1]/table/tbody/tr[1]/td[2]/div/div[2]/div/div/div/div[3]/div"))).perform();
			       Thread.sleep(1000);
	//link copied		     
	}
}
