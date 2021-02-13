package seleniumprograms;

import org.openqa.selenium.By;

public class SpiceJet extends ReusableSeleniumScript{

	private static final String December = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		driver.get("https://book.spicejet.com/");
		driver.findElement(By.xpath("//*[@id=\"marketDate_1\"]/button")).click();	
		
		String actualmonth="March";
		//String expectedmonth=By.xpath("//*[@id=ui-datepicker-div]/div[1]/div/div/span[1]").getText(December);



	}

}
