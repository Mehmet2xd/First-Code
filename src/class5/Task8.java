package class5;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner scan;
		char grade;
		String exp;

		scan = new Scanner(System.in);
		System.out.println("What is your grade");
		grade = scan.next().charAt(0);

		System.out.println("A-Excellent, B-Good, C-Average, D-Bad, Others are not acceptable");
		switch (grade) {

		case 'A':
			exp = "Excellent";
			break;
		case 'B':
			exp = "Good";
			break;
		case 'C':
			exp = "Average";
			break;
		case 'D':
			exp = "Bad";
			break;
		default:
			exp = "Not Acceptable";
		}
		System.out.println("Your grade is " + exp);
	}

}
