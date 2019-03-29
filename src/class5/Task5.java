package class5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner scan;
		boolean sale;
		int discount;
		int price;
		double finalPrice;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter if there is a sale");
		sale=scan.nextBoolean();
		
		
		if(sale) {
			System.out.println("Please enter price of the item");
			price=scan.nextInt();
			System.out.println("Let's check discount");
			
			
			
			if(price<20) {
				discount=20;
				finalPrice=price*0.8;
			}else if (price>=20 && price<100) {
				discount=30;
				finalPrice=price*0.7;
			}else if (price>=100 && price<500) {
				discount=50;
				finalPrice=price*0.5;
			}else {
				discount=75;
				finalPrice=price*0.25;
			}
			
			System.out.println("Your final price is "+finalPrice);
		}else {
			System.out.println("not interested");
		}

	}

}
