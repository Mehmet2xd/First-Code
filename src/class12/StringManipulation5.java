package class12;

public class StringManipulation5 {

	public static void main(String[] args) {
		
		String str="Students";
		
		for(int a=0; a<str.length(); a++) {
			System.out.println(str.charAt(a)+" ");
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
		
		String str1="Sunday";
		
		int index=str1.indexOf("d");
		System.out.println(index);
		
	
		String str2="Syntax Technologies";
		
		System.out.println(str2.indexOf("Syntax"));
		
		System.out.println(str2.indexOf("Technologies"));
		
		System.out.println(str2.indexOf("w"));
		
		System.out.println(str2.indexOf("lo"));
		
		
		//SUBSTRING
		
		String str4="Today is Sunday Java class";
		
		String newstring=str4.substring(5);
		
		System.out.println(newstring);
		
		System.out.println(str4.substring(9, 20));
		
		System.out.println(str4.substring(16,20));
		
		System.out.println(str4.substring(21));
		
	}

}
