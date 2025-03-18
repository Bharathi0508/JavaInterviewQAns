package intermediate;

public class FindSecondLargeElement {
	
	  public static int findSecondLargest(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            throw new IllegalArgumentException("Array must contain at least two elements");
	        }
	        
	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;
	        
	        for (int num : arr) {
	            if (num > first) {
	                second = first;
	                first = num;
	            } else if (num > second && num < first) {
	                second = num;
	            }
	        }
	        
	        if (second == Integer.MIN_VALUE) {
	            throw new IllegalArgumentException("No second largest element found");
	        }
	        
	        return second;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 5, 30, 25};
	        System.out.println("Second Largest: " + findSecondLargest(numbers));
	    }

}
