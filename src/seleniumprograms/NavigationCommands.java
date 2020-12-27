package seleniumprograms;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\parma\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //To maximize the application
		driver.get("https://www.eenadu.net/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("ఆంధ్రప్రదేశ్")).click();
		driver.findElement(By.linkText("తెలంగాణ")).click();
		driver.findElement(By.linkText("జాతీయ- అంతర్జాతీయ")).click();
		driver.findElement(By.linkText("క్రైమ్")).click();
		driver.findElement(By.linkText("పాలిటిక్స్")).click();
		driver.findElement(By.linkText("బిజినెస్‌")).click();
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		/*Refresh ways
		driver.navigate().refresh();
		String curl=driver.getCurrentUrl();
		driver.get(curl);
		driver.navigate().to(curl);
		driver.findElement(By.id("search-by")).sendKeys(Keys.F5);
*/
		driver.close();
		
	}

}
