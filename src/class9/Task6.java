package class9;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		/*Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year.
		 *  As soon as the user enters the correct leap year exit the loop.
		 */

		int guess;
		
		Scanner scan=new Scanner(System.in);
		
		for(int a=1; a<=10; a++) {
			
			System.out.println("Please Guess the leap year");
			guess=scan.nextInt();
			
			if(guess%400!=0) {
				System.out.println("You are still in loop");
			}else {
			  System.out.println("Congratulations! "+guess+" is a leap year. You are out of loop ");
			  break;
			}
			
		}
		
	}

}
