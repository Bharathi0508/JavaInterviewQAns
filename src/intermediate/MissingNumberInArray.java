package intermediate;

/*Why XOR?
XORing a number with itself results in 0 → a ^ a = 0
XORing with 0 gives the same number → a ^ 0 = a
Since all numbers appear twice except the missing one, they cancel out, leaving only the missing number.*/

public class MissingNumberInArray {
	 public static int findMissingNumber(int[] arr, int n) {
	        int xorTotal = 0, xorArray = 0;

	        // XOR all numbers from 1 to n
	        for (int i = 1; i <= n; i++) {
	            xorTotal ^= i;
	        }

	        // XOR all elements in the given array
	        for (int num : arr) {
	            xorArray ^= num;
	        }

	        // Missing number is the XOR difference
	        return xorTotal ^ xorArray;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 4, 5, 6}; // Missing number is 3
	        int n = 6; // Given range 1 to N
	        System.out.println("Missing Number: " + findMissingNumber(numbers, n));

}}
