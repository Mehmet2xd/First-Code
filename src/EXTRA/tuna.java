package EXTRA;

public class tuna {

	private String girlName;
	void setName(String name) {
		girlName=name;
	}
	public String getName() {
		return girlName;
	}
	void saying() {
		System.out.printf("Your first gf is %s", getName());
	}
}
