/*Evelyn Vaughn 
 * 1/24/2020
 * Module 1
 * Lab 2A
*/
import java.util.Scanner;

public class Lab2A {
	public static void main(String[] args) { 
		int[][] data = new int[5][5];
		Scanner scan = new Scanner(System.in); 
		
		for (int a = 0; a < 5; a++) {
            
			for(int b = 0 ; b < 5 ; b++) { 
				System.out.println("Enter number for array values"+" ("+a+","+b+"):");
                data[a][b] = scan.nextInt();
            }
        }
        
        for (int a = 0 ; a < 5; a++) {
            
        	for(int b = 0; b < 5; b++) {
                System.out.printf(data[a][b]+"   ");
            }
            System.out.println();
        }
        int max = LongestPositiveSeries(data);
        System.out.println("Returned Result: " + max);
	}
	public static int LongestPositiveSeries(int[][] data) {
        int max = 0;
        int count = 0;
        
        for (int a = 0; a < 5; a++) {
            
        	for(int b = 0; b < 5; b++) {
                
        		if(data[a][b] > 0) {
                 count++;
                }
                else {
                    if(max < count) {
                        max = count;
                    }
                    count = 0;
                }
            }
        }
        return max;
    }
}
