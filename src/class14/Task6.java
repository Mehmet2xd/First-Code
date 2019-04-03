package class14;

public class Task6 {

	public static void main(String[] args) {
		//3. Find out how many alpha characters present in a string?
		
		String str="%%My name is* Mehmet#546";
		
		String newstr=str.replaceAll("[A-Za-z0-9]", "");
		String newstr1=newstr.replaceAll(" ", "");
		
		System.out.println(newstr1.length());

	}

}
