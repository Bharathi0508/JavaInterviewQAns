package intermediate;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();
	        
	        String result = removeDuplicates(input);
	        System.out.println("String after removing duplicates: " + result);
	
}
	 public static String removeDuplicates(String str) {
	        LinkedHashSet<Character> set = new LinkedHashSet<>();
	        StringBuilder result = new StringBuilder();
	        
	        for (char ch : str.toCharArray()) {
	            if (set.add(ch)) { // Adds only if it's not already in the set
	                result.append(ch);
	            }
	        }
	        return result.toString();
	
	}}
