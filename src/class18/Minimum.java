package class18;

public class Minimum {
	
	/*Create a class Called Minimum

	with in it crate a method called minOfValues

	make it static

	From your previous Applicaions class call the method and pass an array argument

	and prin out the result*/
	
	static int minOfValue(int[]array) {
		
		int min=array[0];
		
	for(int a=1; a<array.length; a++) {
		
		if(array[a]<min) {
			min=array[a];
		}
	}
		return min;
	}

	
	
}

