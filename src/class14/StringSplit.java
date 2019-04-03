package class14;

public class StringSplit {

	public static void main(String[] args) {
		
		String str="Welcome Syntax Students Batch 4";
		
		String[] array=str.split("S");
		
		System.out.println("The length of array is "+array.length);

		for(String subs:array) {
			System.out.println(subs);
		}
		
		System.out.println("-----------------------------");

		for(int a=0; a<array.length; a++) {
			System.out.println(array[a]);		
	
		}
	}

}
