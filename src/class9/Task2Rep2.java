package class9;

import java.util.Scanner;

public class Task2Rep2 {

	public static void main(String[] args) {
		int price,pay,Left;
		int Total=0;
		String item;
		int left=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter what you want");
		item=scan.nextLine();
		System.out.println("Please enter the price of item");
		price=scan.nextInt();
		
		do {
			System.out.println("Please enter your payment");
			pay=scan.nextInt();
			
			Total=Total+pay;
			
			left=price-Total;
			
			System.out.println("Please enter more "+left);
			
		} while(Total!=price);
		
		System.out.println("Thank you for shopping");
		
		

	}

}
