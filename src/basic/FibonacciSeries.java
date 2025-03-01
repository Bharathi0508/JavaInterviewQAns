package basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
      
    	
     Scanner sc = new Scanner(System.in);
     System.out.println(" Enter the number to display the fibonacci series");
    	int n = sc.nextInt();
    	
    	
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) 
        {
            System.out.print(first + " ");
            int next = first + second; // next = 0+1 = 1
            first = second; // first = 1
            second = next; // Second = 1
        }
    }
}

/*
  public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 10; // Number of terms

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) 
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
*/
