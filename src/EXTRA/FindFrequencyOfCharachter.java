package EXTRA;

public class FindFrequencyOfCharachter {

	public static void main(String[] args) {
	
		
		String sentence="This house is awesome";
		
		char ch='e';
		
		int frequency=0;
		
		for(int a=0; a<sentence.length(); a++) {
			
			if(ch==sentence.charAt(a)) {
				
				++frequency;
			}
		}
		
		System.out.println("The frequency of "+ch+" = "+frequency);

	}

}
