package com.ncr.jbehave.tests;

import static org.assertj.core.api.StrictAssertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.serenitybdd.jbehave.SerenityStory;

public class ServiceTwo extends SerenityStory {
	
	private com.ncr.ServiceTwo service = null;
	private List<String> lUsers = new ArrayList<String>();
	private String user = null;

	@Given("ServiceTwo Object created")
	public void initializeService() {
		service = new com.ncr.ServiceTwo();
	}

	@When("User calls getUsers in ServiceTwo")
	public void callGetUsers() {
		lUsers = service.getUsers();
	}

	@Then("Verify that Default user is returned in ServiceTwo")
	public void verifyDefaultUser() {
		assertThat("Default User").isIn(lUsers);
	}

	@When("<user> is added in ServiceTwo")
	public void addAnotherUser(@Named("user") String user) {
		service.addUser(user);
	}

	@Then("Verify that <size> users is returned by getUsers in ServiceTwo")
	public void verifyCustomUserAddedSuccessfully(@Named("size") int size) {
		lUsers = service.getUsers();
		// assertThat("Default User").isIn(lUsers);
		assertThat(lUsers.size()).isEqualTo(size);
	}
	
	@When("User calls getFirstUser in ServiceTwo")
	public void callGetFirstUser() {
		user = service.getFirstUser();
	}

	@Then("Verify that Default user is returned as String in ServiceTwo")
	public void verifyDefaultUserisReturnedAsString() {
		assertThat("Default User").isEqualTo(user);
	}

}
