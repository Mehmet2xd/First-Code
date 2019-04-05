package EXTRA;

import java.util.Scanner;

public class JavaMethods2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		JavaMethods1 test=new JavaMethods1();
		
		System.out.println("Enter your name here= ");
		String nm=scan.nextLine();
		
		test.simpleMessage(nm);

	}

}
