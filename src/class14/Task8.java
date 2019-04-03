package class14;

public class Task8 {

	public static void main(String[] args) {
		// 5. Write a java program to reverse String? Reverse a string word by word?
		
		String str=" My name is Mehmet";
		
		
		
		String reverse="";
		
		for(int x=str.length()-1; x>=0; x--) {
			reverse=reverse+str.charAt(x);
		}
		String[] array=reverse.split(" ");
		
		for(int a=array.length-1; a>=0; a--) {
			System.out.print(array[a]+" ");
		}
		
		

	}

}
