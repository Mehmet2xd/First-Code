package class14;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// 7. Write a java program to check whether a given number is prime or not?
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number");
		int x=scan.nextInt();
		
		
		boolean pr=false;
		for(int a=2; a<=x/2; a++) {
			
			if(x%a==0) {
				
				pr=true;
				break;
				
			
			}
			
		}
		if(pr) {
			System.out.println(x+" is not a prime number");
		}else {
			System.out.println(x+" is a prime number");
		}
		

	}

}
