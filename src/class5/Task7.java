package class5;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner scan;
		String country;
		String language;

		scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = scan.nextLine();

		switch (country) {

		case "USA":
			language = "English";
			break;
		case "Turkey":
			language = "Turkish";
			break;
		case "Poland":
			language = "Polish";
			break;
		case "France":
			language = "French";
			break;
		case "Greece":
			language = "Greek";
			break;
		default:
			language = "Unknown";
		}
        System.out.println("Your language is "+language);
	}

}
