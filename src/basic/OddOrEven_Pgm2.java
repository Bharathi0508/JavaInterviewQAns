package basic;

import java.util.Scanner;

public class OddOrEven_Pgm2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number from 1 to 100");
		 int  Number = sc.nextInt();
		 
		 if(Number%2 == 0) // gives the reminder
		 {
			 System.out.println("The given number is even");
		 }
		 else if(Number == 0) {
			 System.out.println("The Number must not be zero");
		 }
		 
		 else {
			 System.out.println("The given number is odd");
		 }
		 
	}

}
