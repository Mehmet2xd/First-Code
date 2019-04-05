package class15;

public class Dog {
	
	String type,name;
	int leg,ear;
	boolean tail;

	public static void main(String[] args) {
		/*Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
		 * Labrador with specific attributes and behaviours.
		 */
		
		Dog d1=new Dog();
		
		d1.type="Husky";
		d1.name="Karabas";
		d1.leg=5;
		d1.ear=2;
		d1.tail=true;
		
		Dog d2=new Dog();
		
		d1.type="Husky";
		d1.name="Karabas";
		d1.leg=5;
		d1.ear=2;
		d1.tail=true;
		
		Dog d3=new Dog();
		
		d1.type="Husky";
		d1.name="Karabas";
		d1.leg=5;
		d1.ear=2;
		d1.tail=true;
	}
	
	void bark() {
		System.out.println("Dog can bark");
	}

	void run() {
		System.out.println("Dog can run");
	}
	void smell() {
		System.out.println("Dog can smell");
	}
}
