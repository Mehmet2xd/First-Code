package class6;

import java.util.Scanner;

public class ScannerLoop {

	public static void main(String[] args) {
		Scanner scan;
		String name;scan = new Scanner(System.in);
		int a = 1;
		while(a<=3) {
			System.out.println("Please enter your name");
			name = scan.nextLine();
			System.out.println("You are doing great " + name);
			a++;
		}
		

	}

}
