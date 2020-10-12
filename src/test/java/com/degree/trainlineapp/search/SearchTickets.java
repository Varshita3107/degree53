package com.degree.trainlineapp.search;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.degree.pages.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTickets {
	private static WebDriver varDriver;
	private SearchPage searchPage;
	
	@Given("^that I navigates to \"([^\"]*)\" website in Chrome browser$")
	public void that_I_navigates_to_website_in_Chrome_browser(String arg1) throws Throwable {
	    
		//Launching thetrainline website
        WebDriverManager.chromedriver().setup();
        varDriver = new ChromeDriver();
        varDriver.manage().window().maximize();
        
        //varDriver.manage().deleteAllCookies();		
		//varDriver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		varDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		varDriver.get("https://"+arg1+"/");
		searchPage = new SearchPage(varDriver);
	}

	@When("^I enter \"([^\"]*)\" into the From field$")
	public void i_enter_into_the_From_field(String from) throws Throwable {
	    
		//Enter Origin Station
		searchPage.setForm(from);
		 			
	}

	@When("^I enter \"([^\"]*)\" into the To field$")
	public void i_enter_into_the_To_field(String to) throws Throwable {
	    
		//Enter Origin Station
		searchPage.setTo(to); 		
      
	}

	@When("^I select Return option$")
	public void i_select_Return_option() throws Throwable {
		//Select Return option
		varDriver.findElement(By.id("return")).click();
 				    
	}

	@When("^I enter today's date into OUT date field$")
	public void i_enter_today_s_date_into_OUT_date_field() throws Throwable {
	    
		//Select the current date
		searchPage.setToDate();
				
	}

	@When("^I enter RETURN date of (\\d+) days later from today’s date$")
	public void i_enter_RETURN_date_of_days_later_from_today_s_date(int returnum) throws Throwable {
	    
		//Select the return date 3 days later from today's date
		searchPage.setReturnDate(returnum);
					    
	}

	@When("^I enter departure and arival time$")
	public void i_enter_departure_and_arival_time() throws Throwable {
 
		// Select departure time
		searchPage.setTravelOption();
								
	}

	@When("^I select railcards$")
	public void i_select_railcards() throws Throwable {
	    
		// Select railcards
		searchPage.setRailcards();

	}

	@Then("^I should redirected to trainline booking results after submitting details$")
	public void i_should_redirected_to_trainline_booking_results() throws Throwable {
	    //Submit to search train details
		searchPage.submitRail();
		
	}

	
}
