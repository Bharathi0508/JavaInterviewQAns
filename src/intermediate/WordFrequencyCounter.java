package intermediate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input sentence from user
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        // Count word frequency
	        countWordFrequency(sentence);

	        scanner.close();
	    }

	    public static void countWordFrequency(String sentence) {
	        // Convert to lowercase and split words
	        String[] words = sentence.toLowerCase().split("\\s+");

	        // HashMap to store word frequencies
	        HashMap<String, Integer> wordCountMap = new HashMap<>();

	        for (String word : words) {
	            word = word.replaceAll("[^a-zA-Z]", ""); // Remove punctuation
	            if (!word.isEmpty()) {
	                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
	            }
	        }

	        // Print word frequencies
	        System.out.println("\nWord Frequency:");
	        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }
	}


