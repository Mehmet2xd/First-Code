package class10;

import java.util.Arrays;

public class ArrayWork {

	public static void main(String[] args) {
		
		// array lerde siralama
		
		int[] num= {2,8,6,4,5,9,15};
		Arrays.sort(num);
		
		for(int a=0; a<num.length; a++) {
			
			System.out.println(num[a]);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int[] kap= {25,78,95,63,24,75,102};
		
		Arrays.sort(kap);
		
		for(int i=0; i<kap.length; i++) {
			System.out.println(kap[i]);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// belli deger araligini siralama
		
		int[] number= {2,5,4,7,8,9,6,3,0};
		
		Arrays.sort(number,1,5);
		
		for (int z=0; z<number.length; z++) {
			
			System.out.println(number[z]);
		}

	}

}
