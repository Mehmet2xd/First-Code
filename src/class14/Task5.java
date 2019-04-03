package class14;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {

		/*
		 * 2.Write a java program to find the second largest number in the array?
		 * Maximum and minimum number in the array?
		 */

		// Second Largest

		int[] a = { 25, 45, 65, 98, 32, 46, 5 };

		Arrays.sort(a);

		int max = a[0];
		int sec = a[0];
		int min = a[0];

		for (int x = 0; x < a.length; x++) {

			if (a[x] > max) {

				sec = max;
				max = a[x];

			} else if (a[x] > sec) {

				sec = a[x];
			}

		}
		System.out.println("The second largest number is " + sec);

		// maximum

		for (int x = 0; x < a.length; x++) {

			if (a[x] > max) {

				max = a[x];

			}
		}
		System.out.println("The maximum number is " + max);

		// minimum
		for (int x = 0; x < a.length; x++) {

			if (a[x] < min) {

				min = a[x];
			}
		}
		System.out.println("The minimum number is " + min);

	}
}
