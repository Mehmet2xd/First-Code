package class8;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		/* let user define a range of numbers to print */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a starting number");
		int startNumber = scan.nextInt();

		System.out.println("Please enter ending number");
		
		int endNumber = scan.nextInt();
		
		for (int a = startNumber; a <= endNumber; a++) {
			
			System.out.println(a);
		}

		
		//
		
		
	}

}
