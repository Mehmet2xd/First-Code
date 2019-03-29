package class9;

public class Task4 {

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
		for(int a=3; a>=0; a--) {
			for(int b=0; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
