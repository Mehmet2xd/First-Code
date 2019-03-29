package class5;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {

		Scanner scan;
		String country;
		String food;

		scan = new Scanner(System.in);
		System.out.println("Please enter which country you are from");
		country = scan.nextLine();

		switch (country) {

		case "USA":
			food = "Burger";
			break;
		case "Afghanistan":
			food = "Pelau";
			break;
		case "Russia":
			food = "Pelmeni";
			break;
		case "Italy":
			food = "Pasta";
			break;
		case "Turkey":
			food = "Baklava";
			break;
		case "Morocco":
			food = "Couscous";
			break;
		default:
			food = "Unknown";
		}
		System.out.println("Your fav food is " + food);
	}

}
