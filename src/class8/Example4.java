package class8;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a starting number");
		int startNumber = scan.nextInt();

		System.out.println("Please enter ending number");
		
		int endNumber = scan.nextInt();
		
		if(startNumber<endNumber) {
			
			for(int a=startNumber; a<=endNumber; a++) {
				
				System.out.println(a);
			}
		}else {
			
			System.out.println("I will not run your code");
		}

	}

}
