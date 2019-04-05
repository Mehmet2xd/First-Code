package class16;

public class NoMainMethod {
	
	String str;
	int num;
	
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friends");
	}
	
	void bye() {
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		
		NoMainMethod obj=new NoMainMethod();
		
		obj.hello();
		obj.bye();
		
	}
}
