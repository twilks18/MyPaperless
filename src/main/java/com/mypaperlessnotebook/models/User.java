package com.mypaperlessnotebook.models;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	
	private String Firstname;
	private String Lastname;
	private String username;
	private String password;
	 // TODO hash password
	public ArrayList<Experiment> experiment;
	
public User( String username, String password,String Firstname, String Lastname){
	
	this.Firstname = Firstname;
	this.Lastname = Lastname;
	this.username = username;
	this.password = password;	
	experiment = new ArrayList<Experiment>();
	
}




public String getFirstname() {
	return this.Firstname;
}



public void setFirstname(String firstname) {
	this.Firstname = firstname;
}



public String getLastname() {
	return this.Lastname;
}



public void setLastname(String lastname) {
	this.Lastname = lastname;
}



public String getUsername() {
	return this.username;
}
 
public void setUsername(String username) {
	this.username = username;
}

public static boolean isValidUsername(String username) {
	Pattern validUsernamePattern = Pattern.compile("[A-Z][a-zA-Z0-9_-]{4,11}");
	Matcher matcher = validUsernamePattern.matcher(username);
	return matcher.matches();
}

public String getPassword() {
	return this.password;
}

public void setPassword(String password) {
	this.password = password;
}
public static boolean isValidPassword(String password) {
	Pattern validUsernamePattern = Pattern.compile("[A-Z](\\S){6,20}");
	Matcher matcher = validUsernamePattern.matcher(password);
	return matcher.matches();
} 


public ArrayList<Experiment> getExperiment() {
	return experiment;
}

public void addExperiment(Experiment experiment){
	this.experiment.add(experiment);
}

public void removeExperiment(Experiment experiment){
	this.experiment.remove(experiment);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Experiment e1 =  new Experiment("A1","B1","C1","D1","E1");
	Experiment e2 =  new Experiment("A2","B2","C2","D2","E2");
	Experiment e3 =  new Experiment("A3","B3","C3","D3","E3");
	User u = new User("a","b","c","d");
	u.addExperiment(e1);
	u.addExperiment(e2);
	u.addExperiment(e3);
	System.out.println(u.getExperiment().size());
	System.out.println(u.getExperiment());
	System.out.println(u.getExperiment().indexOf(e2));

}
}
