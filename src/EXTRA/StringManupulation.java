package EXTRA;

public class StringManupulation {

	public static void main(String[] args) {
		
		
		String str="The rain has started here";
		
		String str1="The rain Has started here";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(10));
		
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.indexOf('s',str.indexOf('s')+1));
		
		System.out.println(str.indexOf("has"));
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.substring(0,9));
		
		
		String s="   Hello World   ";
		
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", ""));
		
		
		String date="01-01-2018";
		
		System.out.println(date.replace("-", "/"));

	}

}
