package class14;

public class Task2 {

	public static void main(String[] args) {
		/*Create a String that should be combination of letters, numbers and special characters. 
		Find out how many alpha characters are there in the String.*/

		
		String str="^@Today is great day#4554";
				
		String newstr=str.replaceAll("[A-za-z0-9]", "");
		String newstr1=newstr.replaceAll(" ", "");
		
		
		System.out.println(newstr1.length());
		
		
		
		
				
	}

}
