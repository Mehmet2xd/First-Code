package class16;

import java.util.Scanner;

public class Task2 {

	
	void EvenorOdd() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
	}
	public static void main(String[] args) {
		
		Task2 obj=new Task2();
		obj.EvenorOdd();
		
		
	}

}
