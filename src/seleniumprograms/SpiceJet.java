package seleniumprograms;

import org.openqa.selenium.By;

public class SpiceJet extends ReusableSeleniumScript{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("chrome");
		driver.get("https://book.spicejet.com/");
		driver.findElement(By.xpath("//*[@id=\"marketDate_1\"]/button")).click();	
		
		String actualmonth="March";
		String expectedmonth=By.xpath("//*[@id=ui-datepicker-div]/div[1]/div/div/span[1]").getText(December);



	}

}
