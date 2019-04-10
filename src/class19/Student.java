package class19;

public class Student {

	char getGrade(int score) {
		if (score >= 90) {

			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 50) {
			return 'D';
		} else {
			return 'F';
		}
	}

	public static void main(String[] args) {

		Student obj = new Student();
		
		char grade = obj.getGrade(60);
		
		System.out.println(obj.getGrade(20));
		
		System.out.println(grade);

	}

}
