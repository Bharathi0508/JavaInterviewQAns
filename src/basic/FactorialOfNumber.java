package basic;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		// n!= n* (n-1)* (n-2) * (n-3).....*1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number to get factorial of number");
		int num = sc.nextInt();
		int digit =1;
		
		 for(int i = 1; i<num; i++) {
			 
			 digit = digit *(num - i);			 
		 }
		 
		 int factor =  digit * num;
				 
		System.out.println("The Factorial Number is" + factor);
	}

}
