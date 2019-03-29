package class5;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		int mon;
	    String output="";
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Please enter your birthday month number");
	     mon=scan.nextInt();
	     
	     if(mon==12 || mon==1 || mon==2 ){
	       output="Winter";
	     }else if(mon==3 || mon==4 || mon==5){
	       output="Spring";
	     }else if(mon==6 || mon==7 || mon==8){
	       output="Summer";
	     }else if(mon==9 || mon==10 || mon==11){
	       output="Fall";
	     }else{
	       System.out.println("Please enter valid month number");
	       output="Unknow";
	     }
	     System.out.println("You were born in "+output);

	}

}
