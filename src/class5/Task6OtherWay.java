package class5;

import java.util.Scanner;

public class Task6OtherWay {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What is the temperature?");
		int temp = scan.nextInt();

		boolean rain;
		boolean snow;
		boolean sunny;
		String activity;

		if (temp >= 40 && temp < 80) {
			System.out.println("Is it raining");
			rain = scan.nextBoolean();
			if (rain) {
				activity = "I will not go hiking";
			} else {
				activity = "I will go hiking";
			}
		} else if (temp >= 25 && temp < 40) {
			System.out.println("Is it snowing");
			snow = scan.nextBoolean();
			if (snow) {
				activity = "I will go to snowboarding";

			} else {
				activity = "I will not go snowboarding";
			}
		} else if (temp > 80) {
			System.out.println("Is it sunny?");
			sunny = scan.nextBoolean();
			if (sunny) {
				activity = "I will go to beach";

			} else {
				activity = "i will not go to beach";
			}
		} else {
			activity = "stay at home";
		}
            System.out.println("my activisty is "+activity);
	}
}