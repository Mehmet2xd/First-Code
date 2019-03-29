package class5;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner scan;
		int num1;
		int num2;
		char operator;
		int result = 0;

		scan = new Scanner(System.in);
		System.out.println("please enter 2 number and operator");
		num1 = scan.nextInt();
		operator = scan.next().charAt(0);
		num2 = scan.nextInt();

		switch (operator) {

		case '*':
			result = num1 * num2;
			break;
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}

		System.out.println("result is "+result);
	}

}
