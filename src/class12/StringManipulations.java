package class12;

public class StringManipulations {

	public static void main(String[] args) {
		
		// LENGTH OF STRING
		
		String str="Syntax";
		
		int lengthofstring=str.length();
		
		System.out.println(lengthofstring);
		
		
		String str1="Syntax Technologies";
		
		int lof=str1.length();
		
		System.out.println(lof);
		
		
		String str2="Welcome, students";
		
		
		System.out.println(str2.length());
		
		String str3="Hello";
		
		// UPPER CASE
		
		System.out.println(str3.toUpperCase());
		
		// LOWER CASE
		
		System.out.println(str3.toLowerCase());
		
		//String equals
		
		String str4="HELLO";
		String str5="hello";
		
		System.out.println(str4.equals(str5));
		System.out.println(str4.equalsIgnoreCase(str5));
		
		
		
	}

}
