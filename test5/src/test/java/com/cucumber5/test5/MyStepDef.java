package com.cucumber5.test5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDef {
	
	static WebDriver wDriver;
//	@BeforeAll
////	@Before
//	public static void beforeAll() {
//	//	public void beforeAll() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
//		wDriver=new ChromeDriver();
//	}
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		wDriver=new ChromeDriver();
	wDriver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2Fpages&locale=en_US&display=page");
	
	}
	@When("^User enters user \"([^\"]*)\" first name$")
    public void user_enters_user_first_name(String firstName) {
		wDriver.findElement(By.name("firstname")).sendKeys(firstName);
		
	}
	@And("^User enters user \"([^\"]*)\" last name$")
    public void user_enters_user_last_name(String lastname) {
		wDriver.findElement(By.name("lastname")).sendKeys(lastname);
		
	}
	
	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() {
		String value=wDriver.findElement(By.name("firstname")).getText();
		System.out.println(value);
	}
	@Then("^User checks user last name is present$")
	public void user_checks_user_last_name_is_present() throws InterruptedException {
		String lastValue=wDriver.findElement(By.name("lastname")).getText();
		System.out.println(lastValue);
		Thread.sleep(1000);
	}
	@When("User enters folowing data")
	public void user_enters_following_data(DataTable table) {
		List<List<String>> data=table.asLists();
		String values1=data.get(1).get(0);
		String values2=data.get(2).get(0);
		System.out.println("values1 : "+values1);
		System.out.println("values1 : "+values2);
		wDriver.findElement(By.name("firstname")).sendKeys(values1);
	}
	
	@Then("close browser")
	public void cose_browser() {
		wDriver.quit();
	}
	
	
//	@AfterAll
//	//@After
//	//public static void afterAll() {
//		public static void afterAll() {
//	//	public void afterAll() {
//		wDriver.quit();
//	}

}
