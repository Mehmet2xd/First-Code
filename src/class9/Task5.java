package class9;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*Write a guessing game where the user has to guess a secret number between 1 and 20.
		After every guess input, the program tells the user whether their number was too large or too small.
		The program will keep asking the user to enter the number until he finds the correct number. 
		When the correct answer is found the system should display "Congratulations!!. You got it!".*/
		
		int secret=14;
		int guess=0;
		
		Scanner scan=new Scanner(System.in);
		
		for(int a=0; a<=50 ; a++) {
			
			System.out.println("Please guess the number");
			guess=scan.nextInt();
			
			if(guess<secret) {
				System.out.println("you number is too small");
			}else if(secret<guess){
				System.out.println("your number is too large");
			}else {
				System.out.println("Cong!");
				break;
				
			}
				
			}
			
		}
		
	}


