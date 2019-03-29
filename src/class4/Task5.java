package class4;

import java.util.Scanner;

public class Task5 {
public static void main(String[] args) {
	
	Scanner loan=new Scanner(System.in);
	System.out.println("What is the amount of loan needed");
	int myloan=loan.nextInt();
	
	if(myloan<200000) {
		System.out.println("Lend the money");
		}else {
			System.out.println("Reject the client");
		}
		}
	
}

