package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootsrapModals {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parma\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the application
		driver.get("https://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
		Thread.sleep(3000);
		//Single modal Examp
		driver.findElement(By.linkText("Launch modal")).click();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Save changes")).click(); //qn here linktext is worked but in multiple modal for same save changes it didnt work i used xpath it worked - Why
		System.out.println("clicked on Single Modal Save changes");
		Thread.sleep(3000);

		//Multiple Modal Eg
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[1]")).click();	//clicks on multiple Modal
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/a")).click(); //clicks on Launch modal
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/a")).click();  //clicks on Launch modal
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[6]/a[2]")).click(); //clicks on save chnages
		System.out.println("clicked on Multiple Modal Save changes");
		driver.close();
	}

}
