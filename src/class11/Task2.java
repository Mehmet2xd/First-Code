package class11;

public class Task2 {

	public static void main(String[] args) {
		/* Create an array of countries. 
		While retrieving all values from an array print capital for each country. (use 2 different loops).*/
		
		
		
		String[] countries= {"Turkey","USA","France","England"};
		String capital ="";
		
		for(int a=0; a<countries.length; a++) {
		
		switch(countries[a]) {
		
	case "Turkey":
		capital = "Ankara";
		break;
	case "USA":
		capital = "Washington";
		break;
	case "France":
		capital = "Paris";
		break;
	case "England":
		capital = "London";
		break;
		default:
		capital = "Wrong input.";
			
		}
		System.out.println(countries[a]+"\t"+capital);
		
		
		}
	}

}
