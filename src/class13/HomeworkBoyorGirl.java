package class13;

import java.util.Scanner;

public class HomeworkBoyorGirl {

	public static void main(String[] args) {
		/*Write a program that reads two people’s first names and if they expecting boy or girl?
		 *  Based on the input suggests a name for a baby:
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY
			
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL*/
		
		Scanner scan=new Scanner(System.in);
		
		String mname,fname,gender,babyname;
		
		System.out.println("Please enter mothers name");
		
		mname=scan.nextLine();
		
		System.out.println("Please enter father name");
		
		fname=scan.nextLine();
		
		System.out.println("Please enter expected gender");
		
		gender=scan.nextLine();
		
		if(gender.equalsIgnoreCase("boy")) {
			babyname=fname.substring(0,fname.length()/2)+mname.substring(mname.length()/2);
					
		}else if(gender.equalsIgnoreCase("girl")) {
			babyname=mname.substring(0,mname.length()/2)+fname.substring(fname.length()/2);
		}else {
			babyname="No Suggestion";
		}
		
		System.out.println(babyname.toUpperCase());
		
		

	}

}
