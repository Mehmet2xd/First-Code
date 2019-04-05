package EXTRA;

public class JavaMethodsWithReturnValues {

	public static void main(String[] args) {

		int n1 = 10, n2 = 20, maximum;

		boolean equal;
		maximum = max(n1, n2);

		System.out.println("Maximum is " + maximum);
		System.out.println("Maximum is " + max(33, 66));

		System.out.println("----------------------------------------------");

		int z = 10, answer;
		answer = multNumber(z);

		System.out.println("The result is " + answer);

		System.out.println("The result is " + multNumber(15));
		
		System.out.println("--------------------------");
		
		equal=equalNumber(n1,n2);
		
		System.out.println("The result2 is "+equal);
		System.out.println("The result3 is "+equalNumber(20,20));
		

	}

	public static int max(int num1, int num2) {

		int result;

		if (num1 > num2)
			result = num1;

		else
			result = num2;

		return result;

	}

	public static int multNumber(int a) {

		int ans = a * 8;

		return ans;
		
		// or WE CAN WRITE LIKE THAT 
		
		// RETURN (a*8)
	}
	
	public static boolean equalNumber(int a,int b) {
		if(a==b)
			return true;
		else
			return false;
			
	}

}
