package class14;

public class Task1 {

	public static void main(String[] args) {
		
		
		/*Create a String that will hold a sentence. 
		Write a program to get a new String without any spaces.*/
		
		// first way
		
		String str="My name is Khan";
		String new1= "";
		String[] split=str.split(" ");
		
		
		for(int a=0; a<split.length; a++) {
			
			new1=new1+split[a];
			
			
		}
		
		System.out.println(new1);
		
		// second way
		
		for(int b=0; b<split.length; b++) {
		
		System.out.print(split[b]);
		}
	}

}
