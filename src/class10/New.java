package class10;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {

		  
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = input.nextInt();
		}
		
		for (int i=4;i>-1;i--)
		{
			System.out.println(arr[i]);
		
		}
			
		
		  
	}

}
