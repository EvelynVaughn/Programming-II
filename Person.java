/*Evelyn Vaughn 
 * 1/24/2020
 * Module 1
 * Lab 2B
*/
import java.util.Scanner;

public class Person {
	String firstName; 
	String lastName;
	
	public Person() { 
		firstName = "Bob"; 
		lastName = "Smith";
	}
	
	public Person(String f, String l) { 
		firstName = f; 
		lastName = l; 
	}
	
	public String getFirstName() { 
		return firstName; 
	}
	
	public String setFirstName(String f) { 
		return firstName = f; 
	}
	
	public String getLastName() { 
		return lastName;
	}
	
	public String setLastName(String l) { 
		return lastName = l; 
	}
	
	@Override
	public String toString() { 
		return firstName + " " + lastName; 
	}
}
