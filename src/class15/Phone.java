package class15;

public class Phone {
	
	String make,model,color;
	int size,camera;
	boolean speaker;

	public static void main(String[] args) {

		/*
		 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
		 * specific attributes and behaviours.
		 * 
		 * Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
		 * Labrador with specific attributes and behaviours.
		 */
		
		Phone ph1=new Phone();
		
		ph1.make="Iphone";
		ph1.model="XSmax";
		ph1.color="Gold";
		ph1.size=6;
		ph1.camera=3;
		ph1.speaker=true;
		
		System.out.println("I have "+ph1.make+" that has "+ph1.camera+" camera");
		
		Phone ph2=new Phone();
		
		ph1.make="Samsung";
		ph1.model="S8";
		ph1.color="Black";
		ph1.size=5;
		ph1.camera=2;
		ph1.speaker=false;
		
		Phone ph3=new Phone();
		
		ph1.make="Nokia";
		ph1.model="N95";
		ph1.color="Rose Gold";
		ph1.size=4;
		ph1.camera=1;
		ph1.speaker=true;
		
		

		
	}

}
