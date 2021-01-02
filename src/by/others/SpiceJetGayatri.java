
package by.others;

public class SpiceJetGayatri {
	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
		launchBrowser();
		openUrl("https://www.spicejet.com/");
		driver.findElementByClassName("ui-datepicker-trigger").click();
		System.out.println(driver.findElement(By.className("ui-datepicker-month")).getText());

		int i = 0;
		String actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();

		while (!(actualMonth.equalsIgnoreCase("MAY"))) {
			i++;
			System.out.println(actualMonth);
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
			actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();

		}
		System.out.println(i);
		close();
	}
}
