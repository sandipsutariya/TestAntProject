package com.devops.testantproject;

public class HelloWorld {
	
	String message;

	public String getMessage() {
		return message;
	}

	public HelloWorld(String message){
		this.message = message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getGreetins(){
		return getMessage()+"John";
	}

}
