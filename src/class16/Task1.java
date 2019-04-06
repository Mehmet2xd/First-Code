package class16;

public class Task1 {

	int larger(int a,int b) {
		
		
		if(a>b) {
			return a;
		}else {
			return b;
		}
			
			
	}
	 
	 public static void main(String[] args) {
		 ASDF();
		
	}

	public static void ASDF() {
		int a;
		 Task1 obj=new Task1();
		 a=obj.larger(20, 40);
		 System.out.println(obj.larger(20, 40));
		 System.out.println("Larger is "+a);
	}
}
