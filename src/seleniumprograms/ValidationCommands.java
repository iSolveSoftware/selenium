package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\parma\\Downloads\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize(); //To maximize the application
			driver.get("https://www.bing.com/");
			Thread.sleep(3000);
			boolean status=driver.findElement(By.id("bLogo")).isDisplayed();
			if(status==true) {
				System.out.println("Element Present");
	}else{
			System.out.println("Element not Present");
		}
			driver.close();

}
}

//Navigation commands- isDisplayed
//______IsSelected and isEnabled Programs_________________
//driver.findElement(By.id("id_sc")).click();
//Thread.sleep(3000);
//driver.findElement(By.id("hbsettings")).click(); 
//Thread.sleep(3000);
//driver.findElement(By.xpath("//*[@id=\"hbsettree\"]/a[5]/div")).click();
//Thread.sleep(1000);
////driver.findElement(By.linkText("ID=SERP.5027,5127.1")).click();
//boolean status = driver.findElement(By.id("adlt_set_moderate")).isSelected();
//if (status == true) {
//	System.out.println("Moderate Radio button Selected");
//} else {
//	System.out.println("Moderate Radio not Selected");
//}
////boolean status1 = driver.findElement(By.id("adlt_set_strict")).isSelected();
////if (status1 == true) {
////	System.out.println("Strict Radio button unSelected");
////} else {
////	System.out.println("Strict Radio not unSelected");
////}
//boolean status2 = driver.findElement(By.id("vsread")).isEnabled();
//if (status2 == true) {
//	System.out.println("Read CheckBox Enabled");
//} else {
//	System.out.println("Read CheckBox not Enabled");
//}
//driver.close();
//}
//
//
//}