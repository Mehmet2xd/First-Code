package class5;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		boolean loan;
		int score;
		String eligibility;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you need a loan?");
		
		loan = scan.nextBoolean();
		
		eligibility = scan.nextLine();
		
		if (loan) {
			System.out.println("What is your credit score?");
			score = scan.nextInt();
			if (score < 600) {
				eligibility = "Not eligible";
			} else if (score > 600 && score <= 700) {
				eligibility = "Maybe eligible";
			} else if (score > 700 && score <= 800) {
				eligibility = "Eligible";
			} else if (score > 800) {
				eligibility = "Definitely eligible";
			}
		} else {
			eligibility = "Unknown";
		}
		System.out.println("The eligibility is " + eligibility);
	}

}
