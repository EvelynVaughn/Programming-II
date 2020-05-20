/*Evelyn Vaughn 
 * 1/24/2020
 * Module 1
 * Lab 2B
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		
		Person p1 = new Person(); 
		System.out.println(p1.toString()); 
		Scanner scan = new Scanner(System.in);
		
		String f; 
		String l; 
		
		System.out.println("Enter Person 2's First Name: ");
		f =  scan.next(); 

		System.out.println("Enter Person 2's Last Name: "); 
		l =  scan.next(); 

		//translate the inputed value to = p2 to print 
		Person p2 = new Person(f, l); 
		System.out.println(p2.toString()); 
		
		p1.setFirstName("Aly"); 
		p2.setLastName("Sanchez"); 
		
		System.out.println("Person 1 : " + p1.getFirstName() +" "+ p1.getLastName());
		System.out.println("Person 2 : " + p2.getFirstName() +" "+ p2.getLastName()); 
	}
}
