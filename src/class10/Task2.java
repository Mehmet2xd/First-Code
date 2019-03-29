package class10;

public class Task2 {

	public static void main(String[] args) {
		/*2.Create an array of names and store all names of your group.
		Then print your name from that array. (use 2 different ways of creating an array).*/

		String[] names=new String[5];
		
		names[0]="Mehmet";
		names[1]="Ali";
		names[2]="Veli";
		names[3]="Ismail";
		names[4]="Bayram";
		
		System.out.println(names[0]);
		
		String[] namesN= {"Mehmet","Ali","Veli","Ismail","Bayram"};
		
		System.out.println(namesN[0]);
		
	}

}
