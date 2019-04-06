package class17;

import java.util.Scanner;



public class Methods {

	public static void main(String[] args) {
		
		
		
		int obj, answer,answer1 ;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 2 number");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		answer=sum(a,b);
		answer1=sub(a,b);
		
		System.out.println("Sum of two number is "+answer);
		System.out.println("Sub of two number is "+answer1);
		

	
	}
	
	 public static int sum(int a, int b) {
		
		return a+b;
	}
	
	public static int sub(int x, int y) {
		
		return x-y;
	}

}
