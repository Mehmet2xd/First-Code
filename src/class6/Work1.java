package class6;

public class Work1 {

	public static void main(String[] args) {
		/*
		* 1. Declare variable and increase by 100 using shorthand operator
        * 2. Declare variable and decrease by 67 using shorthand operator
        * 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
        * each person should get an equal piece of cake
        *
        * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people
        * using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
          */
		
		int a=10;
		
		a*=5;
		
		System.out.println(a);//50
		
		a+=50;
		
		System.out.println(a);//100
		
		int b=250;
		
		b/=2;
		System.out.println(b);//125
		
		b-=58;
		
		System.out.println(b);//67
		
		double cakePiece1=11;
		
		cakePiece1/=4;
		System.out.println(cakePiece1);
		
		
		int cakePiece2=25;
		
		cakePiece2/=7;
		System.out.println(cakePiece2);
		
		int cakePiece3=25;
		cakePiece3%=7;
		System.out.println(cakePiece3);
	}

}
