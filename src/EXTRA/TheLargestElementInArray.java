package EXTRA;

public class TheLargestElementInArray {

	public static void main(String[] args) {
		
		//First way
		
		
		int[] num= {55,45,78,63,254,20,32,012,235,7895,11651,51651,515};
		
		int largest=num[0];
		
		for(int a=0; a<num.length; a++) {
			
			if(num[a]>largest)
				
				largest=num[a];
			}
		System.out.println(largest);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		//Second Way
		
     	int[] num1= {55,45,78,63,254,20,32,012,235,7895,11651,51651,515};
		
		int large=num1[0];
		
		for(int ex:num1) {
			if(ex>large) {
				
				large=ex;
			}
			
			
		}
		System.out.println(large);
		
		
		
		
		
		}
	}
		
