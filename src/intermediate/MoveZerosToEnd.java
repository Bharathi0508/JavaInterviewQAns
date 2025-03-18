package intermediate;

import java.util.Arrays;

/*How It Works?
Traverse the array and move non-zero elements to the left (maintaining order).
After placing all non-zero elements, fill the rest with zeros.
Time Complexity:
✅ O(N) → Single-pass traversal.
✅ O(1) Space → In-place modification.

Let me know if you need any enhancements! 🚀*/

public class MoveZerosToEnd {
	 public static void moveZeros(int[] arr) {
	        int insertPos = 0; // Position to insert the next non-zero element

	        // Move non-zero elements forward
	        for (int num : arr) {
	            if (num != 0) {
	                arr[insertPos++] = num;
	            }
	        }

	        // Fill remaining positions with zeros
	        while (insertPos < arr.length) {
	            arr[insertPos++] = 0;
	        }
	    }

	    public static void main(String[] args) {
	        int[] numbers = {0, 1, 0, 3, 12, 0, 5}; 
	        moveZeros(numbers);
	        System.out.println("Array after moving zeros: " + Arrays.toString(numbers));
	    }

}
