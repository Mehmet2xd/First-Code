package class6;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int x=1;
		
		x=x+1;
		
		System.out.println(x);
		
		int y=1;
		
		y+=1;
	
		System.out.println(y);
		
		int z=1;
		z++;
		System.out.println(z);
		
		int w=2;
		w++;
		System.out.println(w);
		
		int v=10;
		
		v--;
		
		System.out.println(v);
		
		int a=10;
		int b=++a; //preincrement=first increment > assign
		
		System.out.println("Value of b is "+b);
		System.out.println("Value of a is "+a);
		
		int c=10;
		int d=c++;
		
		System.out.println("Value of d is "+d);
		System.out.println("Value of c is "+c);
		
		int q=100;
		int e=q--;
		
		System.out.println("Value of q is "+q);
		System.out.println("Value of e is "+e);
		
		int h=50;
		int g=--h;
		
		System.out.println("Value if h is "+h);
		System.out.println("Value of g is "+g);

	}

}
