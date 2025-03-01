package basic;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = (n * (n + 1)) / 2; // Using formula
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
/*
 * 
 * import java.util.Scanner;

public class SumUsingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}

*import java.util.Scanner;

public class SumUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N): ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = findSum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

    public static int findSum(int n) {
        if (n == 1) return 1; // Base case
        return n + findSum(n - 1); // Recursive call
    }
}

*/
