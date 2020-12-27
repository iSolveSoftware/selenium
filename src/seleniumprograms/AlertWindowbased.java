package seleniumprograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindowbased {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parma\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // To maximize the application
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("wdgt-file-upload")).click();
	//  Below Commads are given or saved(.exe) in ScliTE on Window after that we r taking that path into selenium
	// ControlFocus("Open","","DirectUIHWND2");
	//	ControlSetText("Open","","Edit1","C:\\Program Files (x86)\\AutoIt3\\Examples\\calculator.au3");
	//	ControlClick("Open","","Button1");	
	    Runtime.getRuntime().exec("C:\\Users\\parma\\Documents\\UploadFil.exe");
		Thread.sleep(8000);
		driver.close();

		
	
	}
}


