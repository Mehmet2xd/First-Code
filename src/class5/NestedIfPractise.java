package class5;

public class NestedIfPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean creditCard=true;
		int balance=1000;
		
		if(creditCard) {
			System.out.println("Let's check the balance");
			if(balance>=1000) {
				System.out.println("pay off now");
			}else {
				System.out.println("you are safe"); 
			}
		}else {
			System.out.println("Do you want a credit card");
		}
	}

}
