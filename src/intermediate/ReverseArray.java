package intermediate;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 30, 25};
        reverseArray(numbers);
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
}
