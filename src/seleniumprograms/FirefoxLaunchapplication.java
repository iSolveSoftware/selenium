package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunchapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\parma\\Downloads\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mortgagecalculator.org/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("homeval")).sendKeys("212313");
		driver.findElement(By.id("downpayment")).sendKeys("49490");
		driver.findElement(By.id("loanamt")).sendKeys("500000");
		driver.findElement(By.id("intrstsrate")).sendKeys("70000");
		driver.findElement(By.id("loanterm")).sendKeys("15");
		driver.findElement(By.name("cal")).click();

		driver.close();
	}

}
