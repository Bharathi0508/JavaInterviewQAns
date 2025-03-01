package basic;

	import java.util.Scanner;

	public class LCM_GCD {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter second number: ");
	        int num2 = scanner.nextInt();
	        scanner.close();

	        int gcd = findGCD(num1, num2);
	        int lcm = (num1 * num2) / gcd; // Using LCM formula

	        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
	        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
	    }

	    // Function to calculate GCD using Euclidean Algorithm
	    public static int findGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	}


