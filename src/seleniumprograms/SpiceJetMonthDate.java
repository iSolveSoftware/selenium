package seleniumprograms;

import org.openqa.selenium.By;

public class SpiceJetMonthDate extends ReusableSeleniumScript{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser("chrome");
		openurl("https://book.spicejet.com/search.aspx");
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		click(By.xpath("//*[@id=\"marketDate_1\"]/button")); //driver.findElement(By.xpath("//*[@id=\"marketDate_1\"]/button")).click();
		System.out.println(driver.findElement(By.className("ui-datepicker-month")).getText());
		int i = 0;
		String actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();

		while ((actualMonth.equalsIgnoreCase("MAY"))) {
			Thread.sleep(3000);

			i++;
			System.out.println(actualMonth);
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
			actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();

		}
		System.out.println(i);
	}

	}

	


