package class5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
        System.out.println("What is the day today");
        String day=inp.nextLine();
        
        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            System.out.println("Weekdays");
    
        }else if (day.equals("sunday") || day.equals("saturday")) {
            System.out.println("Weekend");
        }else {
            System.out.println("Not valid");
        }

	}

}
