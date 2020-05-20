/*Evelyn Vaughn 
 * 1/17/2020
 * Module 1
 * Lab1A
*/
import java.util.Scanner;

public class Lab1A {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = x.nextLine(); 
		
		System.out.print("Enter Age: ");
		String age = x.nextLine(); 
		
		System.out.println(name + " " + age);

	}
}
