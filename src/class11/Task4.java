package class11;

public class Task4 {

	public static void main(String[] args) {
		
		
		/*
		Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		After storing values print the following:
		Mrs Smith, Mr Obama, Ms Jackson.

		*/
		
		String[][] value= {
				//0     1    2     3
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"}};
		
		System.out.println(value[0][1]+" "+value[1][0]+","+value[0][0]+" "+value[1][3]+","+value[0][2]+" "+value[1][2]);
		
		
		}

	}


