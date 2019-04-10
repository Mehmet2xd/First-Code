package class19;

public class Task {
	
	 String createEmail(String name,String lastName,String emailType) {
		
		String email= name+lastName+"@"+emailType+".com";
		return email.toLowerCase();
	}

	public static void main(String[] args) {
		
		Task obj=new Task();
		
		String email=obj.createEmail("Mehmet", "Ozcan","gmail");
		
		System.out.println(email);
		
		email=obj.createEmail("AHMET", "SARI", "GMAIL");
		System.out.println(email);

	}

}
