package intermediate;

import java.util.Scanner;

public class StringPalindrome {
	
	//Palindrome => mom, madam , dad, bob etc

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		 
		System.out.println("Enter a word  to check whether it is a palindrome");
//get the word from user
		
		String word = sc.next();
		
// initialize non-static methods and variables
		
		StringPalindrome sp = new StringPalindrome(); 
		
		if(sp.isPalindrome(word)) {
			
			System.out.println("the given word " + word +" is a palindrome" );
		}
		else {
			System.out.println("the given word " + word +" is not a palindrome");
		}
	}
		
public boolean isPalindrome(String input) {
			
			String original = input;
			String reversed = "";
			
			for(int i = input.length()-1; i>=0; i--) 
			{
			reversed += input.charAt(i);	
		    }
		    return original.equals(reversed);

	}

}
