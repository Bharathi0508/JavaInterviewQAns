package intermediate;

import java.util.HashSet;

public class IntersectionAndUnionInArrays {

	    public static void main(String[] args) {
	        int[] arr1 = {1, 3, 5, 7, 9};
	        int[] arr2 = {3, 4, 5, 8, 9};

	        System.out.println("Union:");
	        findUnion(arr1, arr2);

	        System.out.println("\nIntersection:");
	        findIntersection(arr1, arr2);
	    }

	    public static void findUnion(int[] arr1, int[] arr2) {
	        HashSet<Integer> unionSet = new HashSet<>();

	        for (int num : arr1) {
	            unionSet.add(num);
	        }
	        for (int num : arr2) {
	            unionSet.add(num);
	        }

	        for (int num : unionSet) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void findIntersection(int[] arr1, int[] arr2) {
	        HashSet<Integer> set1 = new HashSet<>();
	        HashSet<Integer> intersectionSet = new HashSet<>();

	        for (int num : arr1) {
	            set1.add(num);
	        }

	        for (int num : arr2) {
	            if (set1.contains(num)) {
	                intersectionSet.add(num);
	            }
	        }

	        if (intersectionSet.isEmpty()) {
	            System.out.println("No common elements.");
	        } else {
	            for (int num : intersectionSet) {
	                System.out.print(num + " ");
	            }
	        }
	    }
	}

