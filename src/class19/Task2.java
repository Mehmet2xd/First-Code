package class19;

public class Task2 {

	private int a;

	protected String reverse(String str) {
		String reversed = "";
		for (int a = str.length() - 1; a >= 0; a--) {
			reversed = reversed + str.charAt(a);
		}
		return reversed;
	}

	private boolean palindrom(String str) {
		
		
		boolean flag = true;
		String reversed=reverse(str);
		
			if (reversed.equalsIgnoreCase(str)) {
			flag = true;
		}
		return flag;
	}

	private String[] array(String str) {

		String[] words=str.split(" ");
		return words;
	}

	public static void main(String[] args) {
		/*
		 * Create a method that will take 1 parameter as a String and return reversed
		 * String. Method should be visibly only within same package.
		 * 
		 * Create a method that will take a String and return whether String is
		 * palindrome or not. Method should available to all classes within your
		 * projects.
		 * 
		 * Create a method that will take a string and return array of words from that
		 * string. Method should be available only within same class.
		 */
		Task2 obj = new Task2();
		System.out.println(obj.reverse("MEHMET"));
		System.out.println(obj.palindrom("Ama"));
		String[] array=obj.array("have a good night");
		for(int a=0; a<array.length;a++) {
			System.out.println(array[a]);
		}

	}

}
