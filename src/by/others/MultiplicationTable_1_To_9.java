//sheraz

package by.others;
	//Multiplication table Programm I created.. 

	public class MultiplicationTable_1_To_9 {

	    public void main(String[] args){
	        for(int i=1;i<=9;i++){
	            for(int x=1;x<=9;x++){
	                System.out.print(i+" * "+x+"= ");
	                System.out.println(i*x);
	                    if(x==9){
	                        System.out.println(""); // printing empty line after every time second multiplier reaches 9
	                    }
	            }
	        }
	    }
	}
///________-----------Reverse Array
	String SeleniumClassMates[]=new String[5];
	SeleniumClassMates[0]="1: Mallika";
	SeleniumClassMates[1]="2: Gayatri";
	SeleniumClassMates[2]="3: Raja";
	SeleniumClassMates[3]="4: Sirazh";
	SeleniumClassMates[4]="5: Madhuri";
	for(int i=SeleniumClassMates.length-1;i>=0;i--){
	    System.out.println(SeleniumClassMates[i]);
	}
//-------------------Gmail--------------------------------
	void implicitExplicitWait(){
	    launchbrowser(); // implicit wait is included in this reusable method
	    openURL("https://www.google.com/");
	    // login to Gmail
	    click(By.id("gb_70"));
	    send_keys(By.id("identifierId"),"selenium.test.sirazh@gmail.com");
	    click(By.xpath("//*[@id='identifierNext']/div/button/div[2]"));
	    send_keys(By.name("password"),"enter password here");
	    click(By.xpath("//*[@id='passwordNext']/div/button/div[2]"));
	    click(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")); // click on gmail button to display email page
	    // Compose new email
	    click(By.xpath("//*[@id=':3c']/div/div"));
	    // enter email , subject and message in body
	    send_keys(By.xpath("//*[@id=':9m']"),"this is simple text");
	    click(By.xpath("//*[@id=':7g']"));
	    send_keys(By.xpath("//*[@id=':8z']"),"sirazhutdin05@yahoo.com");
	    send_keys(By.id(":8h"),"Composing new email");
	    click(By.id(":87")); // click on Send button
	}
	
	//_________datePicker
    void bookFlightOnSpicejet() throws InterruptedException {
        launchBrowser("chrome");
        openURL("https://www.spicejet.com/");
        // select departure City
        click(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        List<WebElement> departureCity=driver.findElements(By.xpath("//*[@id='dropdownGroup1']/div/ul/li"));
        for(int i=0;i<departureCity.size();i++){
            String departureAirportName=departureCity.get(i).getText();
            if(departureAirportName.equalsIgnoreCase("Delhi (DEL)")){
                departureCity.get(i).click();
            }
        }
        // select destination City
        click(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")); // Destination city
        List<WebElement> destination=driver.findElements(By.xpath("//*[@id='dropdownGroup1']/div/ul/li"));
        for(int i=0;i<destination.size();i++) {
            String airportName = destination.get(i).getText();
            if (airportName.equalsIgnoreCase("Hyderabad (HYD)")) {
                destination.get(i).click();
                break;
            }
        }
        // selecting month "April 2020" on date-picker
        for(int i=0;i<=5;i++){
            WebElement month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div"));
            String displayedMonth=month.getText();
            print(displayedMonth);
            if(displayedMonth.equalsIgnoreCase("April 2021")){
                print("it's April");
                break;
            }
            driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click(); // click on next month button
        }
        // selecting date "20" on date-picker
        List<WebElement> flightDate=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
        for(int i=0;i<flightDate.size();i++){
            String currentDate=flightDate.get(i).getText();
            if(currentDate.equalsIgnoreCase("20")){
                flightDate.get(i).click();
                break;
            }
        }
        // clicking on search flights button
        click(By.id("ctl00_mainContent_btn_FindFlights"));
/*        // choosing the flight
        List<WebElement> choosingFlight=driver.findElements(By.xpath("//*[@id='availabilityTable0']/tbody/tr/td/div/div"));
        for(int i=0;i<choosingFlight.size();i++){
            String flightTime=choosingFlight.get(i).getText();
            print(flightTime);
        }*/
    }


	
	
	
