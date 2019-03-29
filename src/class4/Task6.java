package class4;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What is morg rate");
		int morgRate = scan.nextInt();

		if (morgRate > 4.5) {
			System.out.println("I will not buy a house");
		} else {
			System.out.println("What is the house price");
			int morgPrice = scan.nextInt();
			System.out.println("Consider buying");
			if (morgPrice < 200000) {
				System.out.println("I will buy with cash");
			} else {
				System.out.println("I will take loan");
			}
		}
	}
}
