package class12;

public class StringManipulation4 {

	public static void main(String[] args) {

		// START WITH AND AND WITH

		String str = "syntax";

		boolean start = str.startsWith("s");

		System.out.println(start);

		System.out.println(str.endsWith("y"));

		// IS EMPTRY IN STRING

		String str1 = "Hello";

		System.out.println(str1.isEmpty());

		// concat in strings

		String str2 = "Hello, ";
		String str3 = "Ali!";

		System.out.println(str2 + str3);

		System.out.println(str2.concat(str3));
		
		//Trim in String
		
		String expected="You may qualify for a multi-policy discount!";
		String actual="		You may qualify for a multi-policy discount!  ";
		
		actual=actual.trim();
		
		System.out.println(expected.equals(actual));

	}

}
