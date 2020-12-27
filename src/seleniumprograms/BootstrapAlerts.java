package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapAlerts {

	//private static String isDisplayed;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parma\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the application
		driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
		Thread.sleep(3000);
		driver.findElement(By.id("autoclosable-btn-success")).click();
		String text=driver.findElement(By.id("autoclosable-btn-success")).getText();
		System.out.println(text);
		Boolean Displayed = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]")).isDisplayed();
		System.out.println("I'm an autocloseable success  message. I will hide in 5 seconds.\r\n:" +Displayed);
		Thread.sleep(3000);
//		//write conditional Statement for msg displays and hides in 5sec
		Thread.sleep(3000);
		driver.close();
		
	}


}
