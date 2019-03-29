package class4;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
	// main+ctrl+space+enter ( Public static)
	
	
	// take a number from a use and print that number
	
	//int num=22;
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter any number");
	int myNumber=scan.nextInt();
	
	System.out.println("The number you entered is "+myNumber);
}
}
