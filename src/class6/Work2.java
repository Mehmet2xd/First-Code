package class6;

public class Work2 {

	public static void main(String[] args) {
		/*
		 * create a boolean variable workDay and assign true create int variable day and
		 * assign it to 1 as long as it is workDay print--> "I need a day off" and
		 * increment day day once day is 6 --> your condition for your loop should
		 * become false
		 */

		boolean workDay = true;

		int day = 7;

		while (workDay) {
			
			
			System.out.println("I need a day off");
			
			if(day==6) {
				System.out.println("I do not need a day off");
				workDay=false;
			}
			day++;
		}
	}
}

