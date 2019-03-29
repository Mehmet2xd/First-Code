package class11;

public class Task5 {

	public static void main(String[] args) {
		/*Create a 2D array that first row will contain 4 names and second row will contain grades. 
		Then you program should print name of the students that has as an A and B grade*/
		
		String[][] st= {
				
				{"Ali","Veli","Ahmet","Mehmet"},
				{"B","C","D","A"}
				};
		
		System.out.println(st[0][3]+" has a "+st[1][3]+" grade");
		System.out.println(st[0][0]+" has a "+st[1][0]+" grade");
	}

}
