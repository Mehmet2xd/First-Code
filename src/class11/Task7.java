package class11;

public class Task7 {

	public static void main(String[] args) {
		
		

		String[][] car= {
				{"Asia ","America  ","Europe  ","Africa"},
				{"China","Brasil   ","France  ","Sudan"},
				{"Korea","Canada   ","England ","Chad"}
		};
		
		for(int a=0; a<car.length; a++) {
			for(int b=0; b<car[a].length; b++) {
				System.out.print(car[a][b]+" ");
			}
			System.out.println();
		}
		

	}

}
