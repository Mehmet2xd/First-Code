package EXTRA;

public class CalculateTheAverageOfArray {

	public static void main(String[] args) {
		
		double[] num= {22.45,52.45,65.54,45.4};
		
		double sum=0.0;
		
		for(double total:num) {
			
			sum+=total;
		}
		
		double average=sum/num.length;
		
		System.out.println("The average of array is "+average);
		

	}

}
