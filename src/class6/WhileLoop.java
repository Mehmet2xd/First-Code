package class6;

public class WhileLoop {

	public static void main(String[] args) {
		
		int a=1;
		
		while (a<10) {
			System.out.println("Good Morning");
			a++;
		}

		
		int b=1;
		
		while (b<5) {
			System.out.println("I am inside while loop"+b);
			b+=2;
		}
		System.out.println("I am outside of while loop");
		
		
		
		int z=10;
		
		while (z<=20) {
			System.out.println(z);
			z+=4;
		}
		
		int q=1;
		
		while(q<=20) {
			System.out.print(q+" ");
			q+=2;
		}
		
		int e=10;
		
		while(e<=10 && e>-100) {
			System.out.println(e);
			e-=10;
		}
	}

}
