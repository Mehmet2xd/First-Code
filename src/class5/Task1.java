package class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your height");
		int height=scan.nextInt();
		// 1 feet= 12 inches
		int con=height/12;
		
		if(con<5) {
			System.out.println("Short");
		}else if(con>=5 && con<=6 ) {
			System.out.println("Medium");
		}else {
			System.out.println("Tall");
		}
      
	}

}
