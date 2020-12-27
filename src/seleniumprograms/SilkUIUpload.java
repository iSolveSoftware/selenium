package seleniumprograms;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

//import com.sun.jna.platform.unix.X11.Screen;

public class SilkUIUpload {

		public static void main(String[] args) throws InterruptedException, FindFailed {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\parma\\Downloads\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize(); // To maximize the application
			driver.get("https://www.naukri.com/");
			Thread.sleep(8000);
			driver.findElement(By.id("wdgt-file-upload")).click();
			Screen sc=new Screen();
			Pattern filepath=new Pattern("D:\\isolveDev\\seleniumTraining\\resources\\filepath.PNG");
			Pattern openButton =new Pattern("D:\\isolveDev\\seleniumTraining\\resources\\openbutton.PNG");
			
//			sc.wait(filepath, 20);
			sc.type(filepath, "D:\\isolveDev\\seleniumTraining\\resources\\resume.txt");
			Thread.sleep(1000);
			sc.click(openButton);
			Thread.sleep(1000);
			driver.close();

	}


}
