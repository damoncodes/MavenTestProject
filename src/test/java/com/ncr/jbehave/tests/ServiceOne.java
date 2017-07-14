package com.ncr.jbehave.tests;

import static org.assertj.core.api.StrictAssertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.serenitybdd.jbehave.SerenityStory;

public class ServiceOne extends SerenityStory {
	
	private com.ncr.ServiceOne service = null;
	private List<String> lUsers = new ArrayList<String>();
	private String user = null;

	@Given("ServiceOne Object created")
	public void initializeService() {
		service = new com.ncr.ServiceOne();
	}

	@When("User calls getUsers")
	public void callGetUsers() {
		lUsers = service.getUsers();
	}

	@Then("Verify that Default user is returned")
	public void verifyDefaultUser() {
		assertThat("Default User").isIn(lUsers);
	}

	@When("<user> is added")
	public void addAnotherUser(@Named("user") String user) {
		service.addUser(user);
	}

	@Then("Verify that <user> is returned by getUsers")
	public void verifyCustomUserAddedSuccessfully(@Named("user") String user) {
		lUsers = service.getUsers();
		assertThat(user).isIn(lUsers);
	}
	
	@When("User calls getFirstUser")
	public void callGetFirstUser() {
		user = service.getFirstUser();
	}

	@Then("Verify that Default user is returned as String")
	public void verifyDefaultUserisReturnedAsString() {
		assertThat("Default User").isEqualTo(user);
	}
}
