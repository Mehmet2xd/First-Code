package class12;

import java.util.Scanner;

public class HardTask {

	public static void main(String[] args) {

		/*
		 * Accept username, password and confirm password and check following
		 * requirements:
		 * 
		 * Username and Password cannot be empty, if so→ message=”Username and Password
		 * cannot be empty”. Password should be minimum 8 characters, if less →
		 * message=”Password is too short”. Password cannot contain username if so, →
		 * message=”Password cannot contain username”. Password should match confirmed
		 * password, if not → message “Passwords do not match”. Only after all
		 * requirements met → message “Your username and password has been created”
		 */

		String username, password, password1;
		password1 = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter username");
		username = scan.nextLine();
		boolean flagOuterLoop = true;
		boolean flagInnerLoop = true;
		
		
		while(flagOuterLoop) {

		
		System.out.println("Please enter password");
		password = scan.nextLine();

		if (!username.isEmpty() && !password.isEmpty()) {
			if (password.length() >= 8) {
				if (!password.contains(username)) {

					System.out.println("Please confirm password");
					password1 = scan.nextLine();
					if (password1.equals(password)) {
						System.out.println("your username and password has been created");
						flagOuterLoop = false;
					} else {
						System.out.println("password doesnt match");
						System.out.println("Do you want to try again?");
						String question = scan.nextLine();
						if(question.equalsIgnoreCase("yes")) {
							while(flagInnerLoop) {
								System.out.println("Please confirm password");
								password1 = scan.nextLine();
								if (password1.equals(password)) {
									System.out.println("your username and password has been created");
									flagOuterLoop = false;
									flagInnerLoop = false;
							}else {
								System.out.println("Do you want to try again: ");
								if(scan.nextLine().equalsIgnoreCase("no")) {
									System.out.println("Good bye!");
									flagOuterLoop = false;
									flagInnerLoop = false;
								}
							}
								
							}
						}else if(question.equalsIgnoreCase("no")) {
							System.out.println("Good bye also, looser.");
						}else {
							System.out.println("Good bye");
						}
					}

				} else {
					System.out.println("Password cannot contain username");
				}

			} else {
				System.out.println("Password is too short");
			}
		} else {
			System.out.println("Username and Password cannot be empty");
		}
		}
		
		
	}

}
