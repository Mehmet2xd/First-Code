package class4;

import java.util.Scanner;

public class Task53 {
public static void main(String[] args) {
	
	Scanner city=new Scanner(System.in);
	
	System.out.println("What is your city");
	
	String mycity=city.nextLine();
	
	System.out.println("What is the temperature");
	
	int temp=city.nextInt();
	
	int conTemp=(temp-32)*5/9;
	
	System.out.println("The temperature is the "+mycity+" is "+conTemp);
}
}
