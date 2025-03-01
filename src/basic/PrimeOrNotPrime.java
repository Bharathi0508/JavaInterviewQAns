package basic;

import java.util.Scanner;

public class PrimeOrNotPrime {
	
public  static boolean IsPrime(int num) {
		
		if(num<=1) {
			 
			return false;
		}
		
		for(int i = 2; i < Math.sqrt(num); i++)
		{
			if(num%i==0)
			{
				return false;
			}
		
		}
		return true;
	}

	public static void main(String[] args) {
		
		//Prime : It should only be divisible by 1 and itself
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Interger number");
		int number = sc.nextInt();
		
		if (IsPrime(number))
		{
		System.out.println("The given number is prime ");
		
		}
		
		else {
		 System.out.println(" The given number is not prime");
		 }
		
}}
