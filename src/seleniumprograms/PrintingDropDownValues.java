package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PrintingDropDownValues extends ReusableSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("chrome");
		openurl("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
		List<WebElement> sponsorname=driver.findElements(By.xpath("//*[@id=\"c0\"]")); //findElements it is going to give the list of the WebElements
	for(int i=0;i<sponsorname.size();i++) {
		String values=sponsorname.get(i).getText();
		System.out.println(values);
		}
	driver.close();
	
	}

}
