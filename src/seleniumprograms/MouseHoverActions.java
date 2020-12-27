package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parma\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the application
		driver.get("https://www.mortgagecalculator.org/");
		Thread.sleep(3000);
		WebElement mortgage = driver.findElement(By.linkText("Mortgage Calcs"));
		 
		Actions action=new Actions(driver);
		action.moveToElement(mortgage).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("30 yr Fixed")).click();
		Thread.sleep(3000);
		//String text=driver.findElement(By.xpath("/html/body/section/section[2]/div/div[1]/div/ul/li[1]/div/div/h6")).getText();
		String text=driver.findElement(By.tagName("h6")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.close();
		}
	
}
