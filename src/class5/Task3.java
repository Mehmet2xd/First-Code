package class5;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		int commission;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter sales amount");
		int com=scan.nextInt();
         
		if(com>0 && com<100) {
			commission=2 ;
		}else if (com>=100 && com<200) {
			commission=5;
		}else if(com>=200 && com<500) {
			commission=10;
		}else if(com>=500) {
			commission=20;
		}else {
			commission=0;
		}
		System.out.println("Your commission is "+commission);
	} 

}
