package basic;

import java.util.Scanner;

public class Palindrome {
	
	// It will be same while reading it from backward eg: 121,545, mom, dad, anna etc

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		 if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(int num) {
	        int original = num;
	        int reversed = 0;

	        while (num > 0) {
	            int digit = num % 10; // removing the last digit 
	            reversed = reversed * 10 + digit; // Append the number
	            num /= 10;
	        }

	        return original == reversed;
		
		

	}

}


/*
  public class PalindromeRecursive {
    public static void main(String[] args) {
        int number = 121; // Change this number to test
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num, 0);
    }

    public static int reverse(int num, int rev) {
        if (num == 0) return rev;
        return reverse(num / 10, rev * 10 + num % 10);
    }
}
*/
