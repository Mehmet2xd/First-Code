package class4;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {

		Scanner workYear = new Scanner(System.in);
		System.out.println("How many years did you work");
		int years = workYear.nextInt();

		System.out.println("How much money your annual salary");

		int annual = workYear.nextInt();

		if (years >= 5) {
			System.out.println("eligible for bonus");
			if (annual > 50000) {
				System.out.println("bonus is 5000");
			} else {
				System.out.println("bonus is 3000");
			}
		} else {
			System.out.println("not eligible for bonus");
		}
	}
}
