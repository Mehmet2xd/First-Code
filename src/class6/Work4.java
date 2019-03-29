package class6;

import java.util.Scanner;

public class Work4 {

	public static void main(String[] args) {
		/*Ask user to pay for a soda
	     *keep asking user to pay for soda until entered price is not equal to 1.99
	     *after user got a write amount print "Please enjoy your soda"*/
		
		Scanner scan=new Scanner(System.in);
		double price;
		
		do {
			System.out.println("please pay for soda");
			price=scan.nextDouble();
		}while(price!=1.99);
		System.out.println("Please enjoy your soda");

		
	}

}
