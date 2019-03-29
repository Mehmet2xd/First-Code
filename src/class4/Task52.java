package class4;

import java.util.Scanner;

public class Task52 {
	public static void main(String[] args) {

		Scanner age = new Scanner(System.in);
		System.out.println("How old are you");
		int csage = age.nextInt();

		if (csage >= 18) {
			System.out.println("Issue a driver licence");
		} else {
			System.out.println("Get a learners permit");
		}

	}
}
