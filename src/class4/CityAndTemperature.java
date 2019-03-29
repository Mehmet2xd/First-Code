package class4;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {

		Scanner city = new Scanner(System.in);

		System.out.println("Please enter your city");

		String myCity = city.nextLine();

		System.out.println("please enter your temperature in Fahrenheit");

		int tempe = city.nextInt();
		
		int convertedTemp=(tempe-32)*5/9;
		
		System.out.println(convertedTemp);

		System.out.println("The temperature in the city " + myCity + " is " + convertedTemp);

	}
}
