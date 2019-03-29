package class11;

public class Recap {
	
	public static void main(String[] args) {
		
		String[] name=new String[7];
		
		name[0]="Asel";
		name[1]="Awet";
		name[2]="Mehmet";
		name[3]="Ali";
		name[4]="Ahmet";
		name[5]="Hakan"; //will get an runtime exception when trying to access it
		name[6]="Fatma";
		for(int a=0; a<name.length; a++) {
			
			System.out.println(name[a]);
			
		}
		System.out.println("~~~~~~~~~~~~~~~~for loop~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		String[] studentNames= {"Mehmet","Ali","Veli","Hakan","Zeki","Samir"};
		
		for(int i=0; i<=studentNames.length-1; i++) {
			
			System.out.println(studentNames[i]);
		}
		System.out.println("~~~~~~~~~~~~~~~~Advanced for loop~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//retrive values using; advanced for loop, for each loop, enhanced for loop
		
		for(String student: studentNames) {
			System.out.println(student);
		}
		
	}

}
