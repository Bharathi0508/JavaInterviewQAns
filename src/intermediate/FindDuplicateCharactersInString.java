package intermediate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateCharactersInString {
	
	public static void findDuplicateCharacter(String input) {
		 Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count character occurrences
	        for (char ch : input.toCharArray())
	        {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }

	        // Print duplicate characters
	        System.out.println("Duplicate characters in the string:");
	        
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	        	
	        
	            if (entry.getValue() > 1) {
	            
	                System.out.println(entry.getKey() + " -> " + entry.getValue());
	                }
	        }}

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a string");
	 String str = sc.nextLine();
	 
	findDuplicateCharacter(str);
	
	}

}
/*public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        int[] charCount = new int[256]; // ASCII size array

        for (char ch : str.toCharArray()) {
            charCount[ch]++; // Increment count for each character
        }

        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + " -> " + charCount[i]);
            }
        }
    }
}
*/
