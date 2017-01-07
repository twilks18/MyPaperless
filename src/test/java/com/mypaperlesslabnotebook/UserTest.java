package com.mypaperlesslabnotebook;

import java.util.ArrayList;

import com.mypaperlessnotebook.models.Experiment;
import com.mypaperlessnotebook.models.User;

import junit.framework.TestCase;

public class UserTest extends TestCase {

	public void testUser() {
		User u1 = new User("Fred","password","A","B");
		assertEquals("Fred", u1.getUsername());
		assertEquals("password", u1.getPassword());
		assertEquals("A",u1.getFirstname());
		assertEquals("B", u1.getLastname());
		
	}

	public void testGetUsername() {
		User u2 = new User("Fred","password","A","B");
		assertEquals("Fred", u2.getUsername());
	}
		

	public void testSetUsername() {
		User u3 = new User("Fred","password","A","B");
		u3.setUsername("Fred2");
		assertEquals("Fred2", u3.getUsername());
	}

	public void testIsValidUsername() {
		
		assertTrue("Invalid username", User.isValidUsername("Fred22222222"));
		//username must be 5 to 12 characters long
		
		
		assertFalse("Valid username",User.isValidUsername("freds"));
		// username first character must be a capital letter
	}

	public void testGetPassword() {
		User u5 = new User("Fred","password5","A","B");
		u5.getPassword();		
	}

	public void testSetPassword() {
		User u6 = new User("Fred","password6","A","B");
		u6.setPassword("password6-1");
		assertEquals("password6-1",u6.getPassword());
	}
	
	public void testIsValidPassword(){
		assertTrue("Not Valid Password", User.isValidPassword("Popconr1"));
		//password first character must be a capital letter
		//password must be 7 to 21 characters long
		assertFalse("Not Valid Password", User.isValidPassword("Popc orn1"));
		//password cannot contain white, but must contain a number
	}
	
	public void testGetFirstname(){
		
		User u7 = new User("Fred", "password","Freddie","Creepy");
		assertEquals("Freddie", u7.getFirstname());
		
	}
	
	public void testSetFirstname(){
		User u8 = new User("Fred", "password","Freddie","Creepy");
		assertEquals("Freddie", u8.getFirstname());
		u8.setFirstname("Freddie2");
		assertEquals("Freddie2", u8.getFirstname());
		
	}
	
	public void testGetLastname(){
		User u9 = new User("Fred", "password","Freddie","Creepy");
		assertEquals("Creepy", u9.getLastname());
		
	}
	
	public void testSetLastname(){
		User u9 = new User("Fred", "password","Freddie","Creepy");
		assertEquals("Creepy", u9.getLastname());
		u9.setLastname("Creepy2");
		assertEquals("Creepy2", u9.getLastname());
	}
	
	public void testAddAndRemoveExperiment(){
		
		//Create experiment objects to add to ArrayList
		Experiment e1 =  new Experiment("A1","B1","C1","D1","E1");
		Experiment e2 =  new Experiment("A2","B2","C2","D2","E2");
		Experiment e3 =  new Experiment("A3","B3","C3","D3","E3");
		User u = new User("a","b","c","d");
		
		//add experiments to the users list of experiments
		u.addExperiment(e1);
		u.addExperiment(e2);
		u.addExperiment(e3);
		
		//Determine if the experiment ArrayList is an instance of the ArrayList class
		assertTrue(u.experiment instanceof ArrayList);
		
		//Determine if experiments are added to the experiment ArrayList
		assertEquals(2,u.getExperiment().indexOf(e3));
		assertNotSame(1,u.getExperiment().indexOf(e1));
		assertEquals(1,u.getExperiment().indexOf(e2));
		
		//Determine if experiments have been removed from experiment ArrayList
		assertEquals(3, u.getExperiment().size());
		u.removeExperiment(e1);
		assertEquals(2,u.getExperiment().size());
		assertEquals(0,u.getExperiment().indexOf(e2));		
		
	}
	
}
