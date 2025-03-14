package intermediate;

import java.util.Arrays;

/*
 * 
 * 
 * 1️⃣ Bubble Sort
Compares adjacent elements and swaps them if they are in the wrong order.
Repeats this process until the entire array is sorted.
Time Complexity: O(n²) in worst case.


2️⃣ Selection Sort
Finds the smallest element and swaps it with the first position, then the second smallest, and so on.
Time Complexity: O(n²) in worst case.


3️⃣ Insertion Sort
Picks each element and inserts it into its correct position in the sorted part of the array.
Time Complexity: O(n²) in worst case, O(n) in best case (already sorted array).*/
public class Sorting {
	
	   
    // Bubble Sort Implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Selection Sort Implementation
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    // Insertion Sort Implementation
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements that are greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        int[] bubbleArr = arr.clone();
        bubbleSort(bubbleArr);
        System.out.println("Bubble Sorted: " + Arrays.toString(bubbleArr));
        
        int[] selectionArr = arr.clone();
        selectionSort(selectionArr);
        System.out.println("Selection Sorted: " + Arrays.toString(selectionArr));
        
        int[] insertionArr = arr.clone();
        insertionSort(insertionArr);
        System.out.println("Insertion Sorted: " + Arrays.toString(insertionArr));
    }
}



