package class8;

public class Example {

	public static void main(String[] args) {
		
		///*I want to print number from 1 to 20 but skip those that divisible by3*
		for(int a=1; a<=20; a++) {
			
		if(a%3==0) {
			continue;
			
		}
		System.out.println(a);
		}
	}

}
