package class2;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare 2 int variables and than we perform
		//addition, subtruction, multiplication, division
		
		int a=30;
		int b=15;
		double c=3.9;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		
		int sum=a+b;
		int sub=a-b;
		int mult=a*b;
		int div=a/b;
		double squ=3.9*3.9;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		//print the __ of 2 number is __
		
		System.out.println("the sum of 2 number is "+sum);
		System.out.println("the sub of 2 number is "+sub);
		System.out.println("the mult of 2 number is "+mult);
		System.out.println("the div of 2 number is "+div);
		
		System.out.println("the sum of 2 numbers "+a+" and "+b+" is equal to "+sum);
		System.out.println("The square of the "+c+" is "+squ);
		
		int width=5;
		int height=8;
		
	
		int area=width*height;
		int perimeter=(width+height)*2;
		
		System.out.println("the perimeter of rectangle with width "+width+" height "+height+" is equal to "+perimeter+" and the area is "+area);
		
		
	}

}
