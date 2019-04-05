package EXTRA;

import java.util.Scanner;

public class apple {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		tuna test=new tuna();
		System.out.println("PLease enter your first gf name");
		
		String temp=scan.nextLine();
		test.setName(temp);
		test.saying();
	}

}
