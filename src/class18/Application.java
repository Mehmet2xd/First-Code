package class18;

public class Application {

	public static void main(String[] args) {
		
		
		Animal an1=new Animal();
		
		
		
		System.out.println(an1.name);
		System.out.println(an1.age);
		System.out.println(an1.weight);
		System.out.println(Animal.breed);
		
		an1.canBark();
		
		an1.breed="Wolf";
		an1.age=40;
		
		
		System.out.println("----------------------");
		
		Animal an2=new Animal();
		
		System.out.println(an2.name);
		System.out.println(an2.age);
		System.out.println(an2.weight);
		System.out.println(Animal.breed);
		
		System.out.println("-----------------------");
		
		Animal an3=new Animal();
		
		System.out.println(an3.name);
		System.out.println(an3.age);
		System.out.println(an3.weight);
		System.out.println(Animal.breed);
		
		 Minimum add=new Minimum();
		 
		 int[] array= {1,5,4,8,54,64,645,684,3,468,64,513};
		 
		 Minimum.minOfValue(array);
		 
		 System.out.println(Minimum.minOfValue(array));
		
		
		
		
		
	
	}

}
