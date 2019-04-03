package class14;

public class Task9 {

	public static void main(String[] args) {
		// 6. Write a Java Program to find whether a String is palindrome or not?
		
		String str="tat";
		
		String reverse="";
		
		char[] array=str.toCharArray();
		
		for(int a=array.length-1; a>=0; a--) {
			reverse=reverse+array[a];
			
		}

		if(reverse.equals(str)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" is not palindrome");
		}
		

	}

}
