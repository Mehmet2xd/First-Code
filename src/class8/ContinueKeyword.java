package class8;

public class ContinueKeyword {

	public static void main(String[] args) {
	
		for(int a=0; a<5; a++) {
			
			if(a==2) {
				continue;
			}
			System.out.println(a);
			System.out.println("Hi");
		}

		System.out.println("Hello");
		
		for(int b=0; b<=10; b++) {
			
			if(b==2 &&  b==3) {
				continue;
				
			}
			System.out.println(b);
		}
	}

}
