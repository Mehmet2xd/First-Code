package class10;
import java.util.Arrays;

public class ArraysWork2 {

	public static void main(String[] args) {
		// arrays lerde arama yaparak indisi bulma
		
		
		
		int[] num= {5,4,7,66,6,5,9,54,5,95,9,65,5,1};
		
		
		Arrays.sort(num);
		
		for(int a=0; a<num.length; a++) {
			
			System.out.println(num[a]);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
		
		int value=Arrays.binarySearch(num,54);
		
		
		
		System.out.println(value);
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		int[] num2= {4561,516,56161,51651,65151,459,5565,6562,323};
		
		Arrays.sort(num2);
		
		int deger=Arrays.binarySearch(num2,459);
		
		System.out.println(deger);

	}

}
