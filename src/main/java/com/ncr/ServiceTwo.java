package com.ncr;

import java.util.ArrayList;
import java.util.List;

public class ServiceTwo {

	private List<String> lUsers = new ArrayList<String>();

	public ServiceTwo() {
		lUsers.add("Default User");
	}

	public List<String> getUsers() {
		return lUsers;
	}

	public void addUser(String newUser) {
		lUsers.add(newUser);
	}

	public String getFirstUser() {
		return lUsers.get(0);
	}

}
