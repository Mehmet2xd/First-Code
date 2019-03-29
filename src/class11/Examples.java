package class11;

public class Examples {

	public static void main(String[] args) {
		
		
		String[][] food= {
				
				{"burger","fries","hot dog","meat loaf"},
				{"lo mein","fried rice","white rice"},
				{"Biriyani","korma","naan","chick peas"}
		};
		
		for(int row=0; row<food.length; row++) {
			for(int col=0; col<food[row].length; col++) {
				
				System.out.print(food[row][col]+" ");
			}
			System.out.println();
		}
		

	}

}
