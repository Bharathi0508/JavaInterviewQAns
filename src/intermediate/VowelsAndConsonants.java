package intermediate;

import java.util.Scanner;

public class VowelsAndConsonants {

	// Bharathi => Vowels=a,a,i ; Consonants = B,h,r,t,h
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input string from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        // Convert input to lowercase for easy comparison
	        input = input.toLowerCase();
	        
	        // Strings to store vowels and consonants
	        StringBuilder vowels = new StringBuilder();
	        StringBuilder consonants = new StringBuilder();
	        
	        // Iterate through each character in the string
	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) { // Check if the character is a letter
	                if ("aeiou".indexOf(ch) != -1) 
	                {
	                    vowels.append(ch);
	                } else {
	                    consonants.append(ch);
	                }
	            }
	        }
	        
	        // Display the results
	        System.out.println("Vowels: " + vowels.toString());
	        System.out.println("Consonants: " + consonants.toString());
	        
	        scanner.close();
	    }
	}