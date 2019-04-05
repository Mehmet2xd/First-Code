package class16;

import java.util.Scanner;

public class Task3 {

	//Create a method that will print whether given String is palindrome or not.
	void palindrom(){
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter word");
		String a=scan.nextLine();
	
		String rvs="";
		
		for(int x=a.length()-1; x>=0;x--) {
			rvs=rvs+a.charAt(x);
			
			
			
	}
		if(rvs.equals(a)) {
			System.out.println("a is palindrom");
		}else {
			System.out.println("a is not palindrom");
		}

	}
	
	public static void main(String[] args) {
		
		Task3 obj=new Task3();
		obj.palindrom();
	}
	}
