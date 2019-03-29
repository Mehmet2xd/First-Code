package class13;

public class Reverse {

	public static void main(String[] args) {

		// Create a String and print it in reverse order

		String strOriginal = "Sunday";
		
		strOriginal = new StringBuffer(strOriginal).reverse().toString();
		
		System.out.println("Reversed String : " + strOriginal);
		
		// Second way
		
		String str="Sunday";
		
		for(int a=str.length()-1; a>=0; a--) {
			System.out.print(str.charAt(a));
		}
	}

}
