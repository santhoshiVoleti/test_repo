package com.zensar;

public class LoginServiceStub implements LoginService{

	@Override
	public boolean authenticate(String username, String password) {
		System.out.println("Login credentials authenticated successfully !!");
		return true;
	}

}