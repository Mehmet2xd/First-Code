package class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		
	/*	Create a grocery list : fruits
								vegatables
								dairy
	Retrive all values using 2 different loops*/	
		
		
		String[][] gro= { 
				{"fruits", "apple", "orange", "grape"},
				{"veggies","onion", "carrot", "patato"},
				{"dairy",  "milk",  "juice",  "bread"}
		};
		
		for(int a=0; a<gro.length; a++) {
			for(int b=0; b<gro[a].length; b++) {
				
				System.out.print(gro[a][b]+" ");
			}
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~for each loop~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		for(String[] array:gro) {
			for(String array1:array) {
				System.out.print(array1+" ");
			}
			System.out.println();
		}
	}

}
