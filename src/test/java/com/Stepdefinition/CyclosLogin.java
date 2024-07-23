package com.Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class CyclosLogin {

	public static WebDriver driver;
	@Given("^the user is on login page$")
	public void the_user_is_on_login_page() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://license.cyclos.org/app/guest/login");
		}

	@When("^the user enter a valid username and password")
	public void the_user_enter_a_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("kalai");
		driver.findElement(By.id("password")).sendKeys("kalai");
		}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@type='submit']")).click(); 	 
	    //findElement(By.id("pwd")).sendKeys("Test@123");
	    //driver.findElement(By.id("login")).click();
		}

	@Then("^logout$")
	public void logout() throws Throwable {
		System.out.println("logout Successfully");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}

	


}
