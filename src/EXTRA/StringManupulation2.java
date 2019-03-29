package EXTRA;

public class StringManupulation2 {

	public static void main(String[] args) {
		
		//split
		
		String test="Hello_World_Test_Selenium";
		
		String testval[]=test.split("_");
		
		for(int a=0; a<testval.length; a++) {
			
			System.out.print(testval[a]+" ");
		}
		
	
	}

}
