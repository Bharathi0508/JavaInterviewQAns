package basic;

import java.util.Scanner;

public class SwapWithoutThridVariable {

	public static void main(String[] args) {
		
		/*int a = 10;
		int b = 20;*/
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers");
		 a = sc.nextInt();
		 b = sc.nextInt();
		 
		 // Adding the them and getting subtracted each number
		int c = a+b;
		 a = c-a;
		 b = c-b;
		
		System.out.println("After Swapped the values of A and B are " + a + " and "+ b);

	}

}
