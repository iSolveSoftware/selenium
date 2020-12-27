package seleniumprograms;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWebBased {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parma\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the application
		driver.get("https://candidate.psiexams.com/");
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("maroon")).click();
		driver.findElementByXPath(("//*[@id=\"tb3\"]/table/tbody/tr[5]/td/table/tbody/tr[3]/td[2]/font/a/font")).click();
		System.out.println("Create Link clicked");
		Thread.sleep(3000);
		driver.findElement(By.name("emailid")).sendKeys("test@gmail.com");
		System.out.println("Email entered");
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Madhuri");
		System.out.println("First Name Entered");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Madhuri");
		System.out.println("Last Name Entered");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Submit clicked");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Ok Alert cicked");
		Thread.sleep(3000);
		driver.close();
}
}