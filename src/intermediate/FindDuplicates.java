package intermediate;

import java.util.HashSet;

public class FindDuplicates {
	    public static void main(String[] args) {
	        int[] numbers = {4, 5, 6, 7, 8, 4, 9, 5, 6, 10};

	        System.out.println("Duplicate elements in the array:");
	        findDuplicates(numbers);
	    }

	    public static void findDuplicates(int[] arr) {
	        HashSet<Integer> seen = new HashSet<>();
	        HashSet<Integer> duplicates = new HashSet<>();

	        for (int num : arr) {
	            if (!seen.add(num)) { // If already in seen, it's a duplicate
	                duplicates.add(num);
	            }
	        }

	        if (duplicates.isEmpty()) {
	            System.out.println("No duplicates found.");
	        } else {
	            for (int dup : duplicates) {
	                System.out.println(dup);
	            }
	        }
	    }
	}

/* public class FindDuplicatesBruteForce {
 * 
 * public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 8, 4, 9, 5, 6, 10};

        System.out.println("Duplicate elements in the array:");
        findDuplicates(numbers);
    }

    public static void findDuplicates(int[] arr) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    found = true;
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }
        if (!found) {
            System.out.println("No duplicates found.");
        }
    }
}*/
