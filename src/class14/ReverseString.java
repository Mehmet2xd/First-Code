package class14;

public class ReverseString {

	public static void main(String[] args) {
	
		// Reverse String without using a reverse function
		// 1 using toCharArray();
		
		String original="Today is Java Class";
		
		String reverse="";
		
		char[] array=original.toCharArray();
		
		for(int a=array.length-1; a>=0; a--) {
			reverse=reverse+array[a];
		}
		System.out.println("Reversed String is "+reverse);
		
		//2 CharAt()
		
		String reversed="";
		for(int b=original.length()-1; b>=0; b--) {
			reversed=reversed+original.charAt(b);
		}
		System.out.println("Reversed String is "+reversed);
		
		
		//reverse with Substring
		
		String rvs="";
		
		for(int x=array.length; x>0;x--) {
			rvs=rvs+original.substring(x-1,x);
			
			
		}
		System.out.println(rvs);
		
	}

}
