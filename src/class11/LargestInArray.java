package class11;

public class LargestInArray {

	public static void main(String[] args) {
		
		int[] number= {10,25,23,87,54,65,561,32,45,12};
		
		int largest= number[0];
		
		for(int a=1; a<number.length; a++) {
			
			if(number[a]>largest) {
				
				largest=number[a];
			}
		}
		System.out.println("The largest number is "+largest);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int min=number[0];
		
		for(int i=1; i<number.length; i++) {
			
			if(number[i]<min) {
				
				min=number[i];
			}
		}
		
		System.out.println("The minimum number is "+min);

	}

}
