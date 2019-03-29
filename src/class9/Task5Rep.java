package class9;

import java.util.Scanner;

public class Task5Rep {

	public static void main(String[] args) {

		int secret = 14;
		int guess = 0;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Please enter any number from 1 to 20");
			guess = scan.nextInt();

			if (guess < secret) {
				System.out.println("You are yoo small");
			} else if (guess > secret) {
				System.out.println("You are too large");
			}

		} while (secret != guess);

		System.out.println("Congratulations!!. You got it");
	}
}
