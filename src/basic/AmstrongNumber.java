package basic;

import java.util.Scanner;

public class AmstrongNumber {

	/*Amstrong number is a number that is equal to the sum of its digits,
	each raised to the power of the number of digits.
	 example : 153 = (1*1*1)+(5*5*5) +(3*3*3)= 153
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number to check whether it is a Amstrong number");
		int number = sc.nextInt();

		  if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }

	    public static boolean isArmstrong(int num) {
	        int original = num, sum = 0, digits = countDigits(num);

	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, digits);
	            num /= 10;
	            }

	        return sum == original;
	    }

	    public static int countDigits(int num) {
	        return String.valueOf(num).length();
	    }
	}
		

