package org.stepDefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.sample.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	@Given("FaceBook URL Launched")
	public void face_book_url_launched() {

		BrowserLaunch("chrome");
		maximize();
		loadUrl("https://www.facebook.com/");

	}

	@When("User Enter Username and password")
	public void user_enter_username_and_password(DataTable dataTable) {
		List<String> asList = dataTable.asList();
		
		WebElement userName = findElement("id", "email");
		
		userName.sendKeys(asList.get(1));
	
	
	}

	@Then("Takescreenshot")
	public void takescreenshot() throws IOException {

		screenShot("C:\\aaanewsample\\cucumbersnap.png");

	}

}
