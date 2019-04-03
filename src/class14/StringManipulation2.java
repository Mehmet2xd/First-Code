package class14;

public class StringManipulation2 {

	public static void main(String[] args) {
		
		// toCharArray()- convert String to array of characters
		
		String str="saturday";
		
		char[] array=str.toCharArray();
		
		for(int a=0; a<array.length; a++) {
			
			System.out.println(array[a]);
			
		}
			for(char c:array) {
				System.out.println(c);
			
		}
			// print in reverse
			for(int a=array.length-1; a>=0; a--) {
				System.out.print(array[a]);
			}
	}

}
