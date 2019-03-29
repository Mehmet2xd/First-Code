package class9;

public class Task4Rep {

	public static void main(String[] args) {
		/* Print the following pattern:
		*
		**
		***
		****
		*****
		****
		***
		**
		*
*/
	
	for(int x=1; x<=5; x++) {
		for(int y=1; y<=x; y++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int a=1; a<=4; a++) {
		for(int b=4; b>=a; b--) {
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
