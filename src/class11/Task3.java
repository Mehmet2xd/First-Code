package class11;

public class Task3 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an
		// array.

		int[] number = { 12, 52, 65, 23, 11, 21, 54, 65 };

		int sum = 0;

		for (int a = 0; a < number.length; a++) {

			sum = sum + number[a];

		}

		System.out.println(sum);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		

	}

}
