package intermediate;
/*How the Code Works
The array {10, 20, 30, 40, 50, 60, 70} is sorted.
The user inputs a number to search.
The binarySearch() function:
Finds the middle element.
Compares it with the target.
Narrows the search range based on comparison.
Returns the index if found, else returns -1.*/

import java.util.Scanner;

public class BinarySearch {
	   
    // Binary Search Function (Iterative)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            
            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        
        return -1; // Target not found
    }
    
    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
        
        int result = binarySearch(sortedArray, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        
        scanner.close();
    }
}



