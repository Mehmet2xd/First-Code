package class9;

import java.util.Scanner;

public class Task2Replace {

	public static void main(String[] args) {
		
		String item;
		int price,pay=0;
		int Total=0;
		int remain=0;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter what you want to buy");
	    item=scan.nextLine();
	    System.out.println("Please enter the item price");
	    price=scan.nextInt();
	    
	    for(int a=pay; remain<=price; a++) {
	    	
	    	System.out.println("Please enter how much u pay");
	    	pay=scan.nextInt();
	    	
	    	remain=price-pay;
	    	
	    	if(remain>0) {
	    		System.out.println("You need to pay "+remain+" more");
	    		
	    		price=remain;
	    	}else if(remain<=0) {
	    		System.out.println("thank you for shopping");
	    		break;
	    	}
	    	
	    }
	    

	}

}
