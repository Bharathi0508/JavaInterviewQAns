package basic;

import java.util.Scanner;

public class IsLeapYear {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a year to find whether it is leap year or not");
		 int year = sc.nextInt();
		 
		 if((year%4 ==0 && year % 100 != 0) || (year % 400 == 0)) {
			 
			 System.out.println(" The year given is leap year");
		 }
		else {
				 System.out.println("The year given is not a leap year");
			 }
			 
			 
		
		 }

	}


