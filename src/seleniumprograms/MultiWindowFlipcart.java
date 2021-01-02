package seleniumprograms;

import org.openqa.selenium.By;

public class MultiWindowFlipcart extends ReusableSeleniumScript   {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		openurl("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();			
		driver.getWindowHandles();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]")).click();
		
	}

}
