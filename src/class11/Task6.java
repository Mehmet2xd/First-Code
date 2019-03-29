package class11;

public class Task6 {

	public static void main(String[] args) {
		/*
		 
		 
		 
		 */

	
		String[][] car= {
				{"American ","German  ","Korean","Italian"},
				{"Chevrolet","BMW     ","KIA   ","Ferrari"},
				{"GMC      ","Mercedes","Honda ","Lamborgini"}
		};
		
		for(int a=0; a<car.length; a++) {
			for(int b=0; b<car[a].length; b++) {
				System.out.print(car[a][b]+" ");
			}
			System.out.println();
		}
		
		
	}

}
