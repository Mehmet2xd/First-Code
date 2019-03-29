package class9;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*1. Write a program that reads a range of integers (start and end point), 
		provided by a user and then from that range prints the sum of the even and odd integers.*/

		
		int sum=0;
		int sum1=0;
		int fnum, lnum;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your first number");
		
		fnum=scan.nextInt();
		
		System.out.println("Please ener last number");
		
		lnum=scan.nextInt();
		
		for(int a=fnum; a<=lnum; a++) {
			if(a%2==1) {
				sum=sum+a;
				
				
			}else if(a%2==0) {
				sum1=sum1+a;
				
				
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
		
	}

}
