package class4;

public class NestedIfAgain {
public static void main(String[] args) {
	
	double gpa=3.6;
	double expectedGpa=3.5;
	
	boolean hasDiploma=true;
	
	if(hasDiploma==true) {
		System.out.println("Cong!");
		if(gpa>expectedGpa) {
			System.out.println("You are hired");
		}else {
			System.out.println("Unfortunately we cannot hire you");
		}
	}else {
		System.out.println("Please get your degree");
	}
}
}
