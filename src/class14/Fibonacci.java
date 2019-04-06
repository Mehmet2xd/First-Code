package class14;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// 8. Write a Java Program to print first 10 numbers of Fibonacci series.*/
		FIBONACCI();
		
		
		

	}

	public static void FIBONACCI() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of terms");
		
		int n = sc.nextInt();
		
		int i = 0, j = 1, nextTerm;
		
		System.out.println("Fibonacci series is ");
		
		for (int c = 0; c < n; c++) {
			
			if (c <= 1)
				nextTerm = c;
			else {
				nextTerm = i + j;
				i = j;
				j = nextTerm;
			}
			System.out.println(nextTerm);
		}
	}

}
