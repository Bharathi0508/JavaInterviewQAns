package intermediate;

import java.util.HashSet;

public class FindCommonElements {
	
	    public static void main(String[] args) {
	        int[] arr1 = {1, 3, 5, 7, 9, 11};
	        int[] arr2 = {2, 3, 5, 8, 9, 12};

	        System.out.println("Common elements:");
	        findCommonElements(arr1, arr2);
	    }

	    public static void findCommonElements(int[] arr1, int[] arr2) {
	        HashSet<Integer> set = new HashSet<>();
	        HashSet<Integer> common = new HashSet<>();

	        for (int num : arr1) {
	            set.add(num);
	        }

	        for (int num : arr2) {
	            if (set.contains(num)) {
	                common.add(num);
	            }
	        }

	        if (common.isEmpty()) {
	            System.out.println("No common elements found.");
	        } else {
	            for (int num : common) {
	                System.out.print(num + " ");
	            }
	        }
	    }
	}


