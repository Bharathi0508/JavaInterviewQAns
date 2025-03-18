package intermediate;

import java.util.HashMap;

public class SubArraySumIsZero {

	    public static void main(String[] args) {
	        int[] arr = {1, 2, -3, 3, 1, -4, 2, 2, -2, 3};

	        int maxLength = findLongestZeroSumSubarray(arr);
	        System.out.println("Length of the longest subarray with sum 0: " + maxLength);
	    }

	    public static int findLongestZeroSumSubarray(int[] arr) {
	        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
	        int maxLength = 0;
	        int sum = 0;

	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];

	            if (sum == 0) {
	                maxLength = i + 1; // Whole subarray from 0 to i
	            }

	            if (sumIndexMap.containsKey(sum)) {
	                maxLength = Math.max(maxLength, i - sumIndexMap.get(sum));
	            } else {
	                sumIndexMap.put(sum, i);
	            }
	        }

	        return maxLength;
	    }
	}

