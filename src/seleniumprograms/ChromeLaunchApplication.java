package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\parma\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mortgagecalculator.org/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("homeval")).sendKeys("212313");
		System.out.println("homeval");
		driver.findElement(By.id("downpayment")).sendKeys("49490");
		System.out.println("downpayment");
		driver.findElement(By.id("loanamt")).sendKeys("500000");
		System.out.println("loanamt");
		driver.findElement(By.id("intrstsrate")).sendKeys("70000");
		System.out.println("intrstsrate");
		driver.findElement(By.id("loanterm")).sendKeys("15");
		System.out.println("loanterm");
		driver.findElement(By.name("cal")).click();
		System.out.println("calculater");

		driver.close();
	

	}

}
