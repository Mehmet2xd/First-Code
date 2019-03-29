package class12;

public class StringManipulation3 {

	public static void main(String[] args) {
		
		//Contains in STRING
		
		String str="Good Morning, students!";
		
		System.out.println(str.contains("Morning"));
		
		
		String present="Welcome,Mehmet";
		
		boolean flag=present.contains("Welcome,");
		
		
		System.out.println(flag);
		
		
		
		//Using 2 different manipulation
		
		//Lower case and Contain
		
		
		String neededValue="Welcome,";
		
		
		boolean flag1=present.toLowerCase().contains(neededValue);
		
		System.out.println(flag1);
		
		
		
	}

}
