package class14;

import java.util.Scanner;

public class FibonacciWhileLoop {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter range");
		int a=scan.nextInt();
		
		int first=0, second=1, i=0, next;
		
		while(i<a) {
			if(i<=1) {
				next=i;
			}else {
				next=first+second;
				first=second;
				second=next;
			}
			System.out.println(next);
			i++;
		}
		
	}

}
