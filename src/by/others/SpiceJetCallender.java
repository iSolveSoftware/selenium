package by.others;

import seleniumprograms.ReusableSeleniumScript;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SpiceJetCallender extends ReusableSeleniumScript {


public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
launchBrowser("chrome");
openurl("https://www.spicejet.com/");
driver.findElement(ByClassName("ui-datepicker-trigger")).click();
System.out.println(driver.findElement(By.className("ui-datepicker-month")).getText());
//driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
//System.out.println(driver.findElement(By.className("ui-datepicker-month")).getText());
int i=0;
String actualMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
for (i=1;i<=12;i++) {
driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
actualMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
System.out.println(actualMonth);
if (actualMonth.equalsIgnoreCase("May")) {

System.out.println(i);
break;
}


}

}

private static By ByClassName(String string) {
	// TODO Auto-generated method stub
	return null;
}
}
