package com.degree.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class SearchPage {
	WebDriver driver;
	Date sysDate;
	SimpleDateFormat formatDate;
	private String toDay;
	private final int weekDays = 7;
	
	
	@FindBy(name = "from.search")
	private WebElement fromElement;
	
	@FindBy(xpath = "//span[contains(text(),'Manchester Airport')]")
	private WebElement fromName;
	
	@FindBy(name = "to.search")
	private WebElement toElement;
	
	@FindBy(xpath = "//*[@data-test=\"suggested-station-name\"]")
	private WebElement toName;
		
	@FindBy(id = "page.journeySearchForm.outbound.title")
	private WebElement toDate;
	
	@FindBy(id = "page.journeySearchForm.inbound.title")
	private WebElement returnDate;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[3]/fieldset[1]/div[3]/div/select")
	private WebElement getDeparture;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[3]/fieldset[1]/div[4]/div[1]/select")
	private WebElement getDepartureHr;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[3]/fieldset[1]/div[4]/div[2]/select")
	private WebElement getDepartureMin;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[3]/fieldset[2]/div[3]/div/select")
	private WebElement getArrival;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[3]/fieldset[2]/div[4]/div[1]/select")
	private WebElement getArrivalHr;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[3]/fieldset[2]/div[4]/div[2]/select")
	private WebElement getArrivalMin;
	
	@FindBy(id = "passenger-summary-btn")
	private WebElement addRail;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[4]/div/div/div/div[1]/div/div/select")
	private WebElement getAdult;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[4]/div/div/div/div[2]/div[1]/div/select")
	private WebElement getChild;
	
	@FindBy(name = "child-0")
	private WebElement getAge;

	@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[4]/div/div/ul/li/button")
	private WebElement linkAddrail;
	
	@FindBy(id = "railcardRow0")
	private WebElement getRailcard;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[4]/div/div/ul/li[1]/div/div/div/div/div[2]/select")
	WebElement getRailcardcount;
	
	@FindBy(xpath = "//button[@data-test=\"passenger-summary-btn-done\"]")
	//@FindBy(xpath = "//*[@id="app"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[4]/div/div/button")
	private WebElement clickButtondone;
	
	@FindBy(xpath = "//*[@data-test=\"submit-journey-search-button\"]")
	private WebElement clickSubmit;
	
	
	public SearchPage(WebDriver varDriver) {
		
		this.driver = varDriver;
		PageFactory.initElements(driver, this);
	}

	public void setForm(String from) {
		
		fromElement.sendKeys(from);
		fromName.click();
	}
	public void setTo(String to) {
		
		toElement.sendKeys(to);
		toName.click();
		
	}
	public void setToDate() {
		
		toDate.click();
				
		sysDate = new Date();
		formatDate = new SimpleDateFormat("dd");
		toDay = formatDate.format(sysDate);
		
		String commonXpathtr = "//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[3]/fieldset[1]/div[2]/div[2]/div/div[1]/table/tbody/tr[";
		String commonXpathtd = "]/td[";
		boolean flag = false;
		for(int rowNo=1;  rowNo<=5; rowNo++){
			for(int colNo=1;colNo<=weekDays; colNo++ ) {
				
				String dayNo = driver.findElement(By.xpath(commonXpathtr+rowNo+commonXpathtd+colNo+"]")).getText();
				if(dayNo.equals(toDay)){
					driver.findElement(By.xpath(commonXpathtr+rowNo+commonXpathtd+colNo+"]")).click();
					flag=true;
					break;
			}
			
		}
		if(flag) {
			break;
		}
		
		}

		
	}
	public void setReturnDate(int returnum) {
		
		returnDate.click();
		
		sysDate = new Date();
		formatDate = new SimpleDateFormat("dd");
					
		toDay = formatDate.format(sysDate);
		System.out.println("Current Date " +toDay);
					
		Calendar cl = Calendar.getInstance();
					
				 //cl.setTime(sysDate2);
				 cl.setTime(sysDate);
				 cl.add(Calendar.YEAR, 0);
				 cl.add(Calendar.MONTH, 0);
				 cl.add(Calendar.DATE, returnum);
				
		Date returnNum = (Date) cl.getTime();
										
		String returnDate = formatDate.format(returnNum);
		System.out.println("Return Date " +returnDate);
						
		String commonXpathtr = "//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[3]/fieldset[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[";
		String commonXpathtd = "]/td[";
		boolean flag = false;		
		for(int rowNo=1; rowNo<=5; rowNo++){
			for(int colNo=1;colNo<=weekDays; colNo++ ) {
						
				String dayNo = driver.findElement(By.xpath(commonXpathtr+rowNo+commonXpathtd+colNo+"]")).getText();
				System.out.println(dayNo);
				if(dayNo.equals(returnDate)){
					driver.findElement(By.xpath(commonXpathtr+rowNo+commonXpathtd+colNo+"]")).click();
					flag=true;
					break;
					}
					
				}
			if(flag) {
				break;
				}
				
			}
			    
		
	}
	public void setTravelOption() {
		
		//Select the departure time
		Select selectdepart = new Select(getDeparture);
		selectdepart.selectByValue("departAfter");
		
		Select selectdeparthr = new Select(getDepartureHr);
		
		//Reset the hour 
		LocalTime time = LocalTime.now();
		int hour = 0;
		if (time.getHour() == 23) {
			hour = 0;
		} else {
			hour = time.getHour()+1;
		}
		selectdeparthr.selectByIndex(hour);
		
		Select selectdepartmin = new Select(getDepartureMin);
		selectdepartmin.selectByValue("15");
				
		//Select the arrival time
		Select selectarrival = new Select(getArrival);
		selectarrival.selectByValue("arriveBefore");
		
		Select selectarrivalhr = new Select(getArrivalHr);
		selectarrivalhr.selectByValue("09");	
		
		Select selectarrivalmin = new Select(getArrivalMin);
		selectarrivalmin.selectByValue("30");
	}
	public void setRailcards() throws InterruptedException {
		
		addRail.click();
		
		Select selectadult = new Select(getAdult);
		selectadult.selectByValue("2");
		
		Select selectchild = new Select(getChild);
		selectchild.selectByValue("1");
		
		Select selectage = new Select(getAge);
		selectage.selectByVisibleText("3-4");
		
		//First method
		/*Thread.sleep(5000);
		linkAddrail.click();
		Thread.sleep(3000);
		
		Select selectrailcard = new Select(getRailcard);
		selectrailcard.selectByValue("16-25 Railcard");*/
		
		//Second method
		WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/main/div[1]/div[2]/div/div/div[1]/section/form/div[4]/div/div/ul/li/button"));
		element.click();
		Select selectrailcard = new Select(driver.findElement(By.xpath("//*[@id=\"railcardRow0\"]")));
		selectrailcard.selectByVisibleText("16-25 Railcard");
		
		Select selectrailcardcount = new Select(getRailcardcount);
		selectrailcardcount.selectByValue("2");
	
		clickButtondone.click();
				
	}

	public void submitRail() {
		
		clickSubmit.click();
			
	}

	}
