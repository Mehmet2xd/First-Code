package class5;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the temperature?");
		int temp=scan.nextInt();
		boolean rain;
		boolean snow;
		Boolean sunny ;

		if(temp>=40 && temp<80) {
			System.out.println("Is it raining");
			rain=scan.nextBoolean();
			if(rain) {
				System.out.println("I will not go hiking");
			}else {
				System.out.println("I will go hiking");
			}
		}else if(temp>=25 && temp<40) {
			System.out.println("Is it snowing");
			snow = scan.nextBoolean();
			if(snow) {
			System.out.println("I will go to snowboarding");
			//snow=scan.nextBoolean();
			}else {
				System.out.println("I will not go snowboarding");
			}
		}else if(temp>80) {
			System.out.println("Is it sunny?");
			sunny=scan.nextBoolean();
			if(sunny) {
				System.out.println("I will go to beach");
				
			}else {
				System.out.println("i will not go to beach");
			}
		}
			
	}

}
