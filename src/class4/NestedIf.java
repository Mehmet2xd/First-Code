package class4;

import java.util.Scanner;

public class NestedIf {
public static void main(String[] args) {
	
	
	int eligibleAge=16;
	int retirementAge=64;
	
	Scanner myage=new Scanner(System.in);
	System.out.println("how old are you");
	int workp=myage.nextInt();
	
	if(workp<eligibleAge) {
		System.out.println("You are too young, no work for you");
	}else {
		System.out.println("You are eligible to work");
		if(workp<retirementAge) {
			System.out.println("Go work hard");
		}else {
			System.out.println("Please enjor your life. You dont need to work");
		}
	}
}
}
