package class9;

public class Examples2 {

	public static void main(String[] args) {
	/*	
		******
		*    *
		*    *
		******
		*/
		
		
		
		for(int a=1; a<=4; a++) {
			
			
			for(int b=1; b<=6; b++) {
				
				if(a==1 || a==4 || b==1 || b==6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
