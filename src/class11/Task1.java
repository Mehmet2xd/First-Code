package class11;

public class Task1 {

	public static void main(String[] args) {
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		
		String[] brand= {"Maserati","Tofas","Hyundai","Toyota","Ferrari","Honda"};
		
		for(int a=0; a<brand.length; a++) {
			System.out.println(brand[a]);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~for each loop~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(String elements:brand) {
			System.out.println(elements);
		}

	}

}
