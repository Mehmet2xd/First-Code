package class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("Please enter your quiz score");
       int quiz=scan.nextInt();
       System.out.println("Please enter your mid term score");
       int midTerm=scan.nextInt();
       System.out.println("Please enter your final score");
       int finalS=scan.nextInt();
       
       double ave=(quiz+midTerm+finalS)/3;
       
       if(ave>=90) {
    	   System.out.println("Grade A");
       }else if(ave>=70 && ave<90) {
    	   System.out.println("Grade B");
       }else if(ave>=50 && ave<70) {
    	   System.out.println("Grade C");
       }else{
    	   System.out.println("Grade F");
       }
	}

}
