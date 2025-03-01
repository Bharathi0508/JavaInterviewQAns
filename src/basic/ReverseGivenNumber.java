package basic;

import java.util.Scanner;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer Number");
		int num = sc.nextInt();
	
		int ReverseNum = 0;
		
		while(num != 0) {
			
			int digit = num% 10; // will get Last digit number
			ReverseNum = ReverseNum*10 + digit; // Appending the number we got in digit 
			num /=10;// Removing the decimal number
			
		}
		
		 System.out.println(" The given reversed number is " + ReverseNum );
          
	}

}
