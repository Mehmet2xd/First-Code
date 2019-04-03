package class15;

public class Computer {

	String  os, brand;
	int screen, ram;
	boolean mouse, keyboard;
	
	public static void main(String[] args) {
		
		Computer comp1= new Computer();
		
		comp1.mouse=true;
		comp1.keyboard=true;
		comp1.screen=2;
		comp1.ram=8;
		comp1.os="Windows";
		comp1.brand="Apple";
		
		comp1.watchMovie();
		comp1.doJavaCoding();
		comp1.playMusic();
		
		
		Computer comp2= new Computer();
		
		comp2.mouse=false;
		comp2.keyboard=false;
		comp2.screen=5;
		comp2.ram=16;
		comp2.os="Mac os";
		comp2.brand="HP";
		
		comp2.watchMovie();
		comp2.doJavaCoding();
		comp2.playMusic();

		
	}
	void watchMovie() {
		System.out.println("We can watch movie on a computer "+brand);
	}
	void doJavaCoding() {
		System.out.println("we can do Java coding on a computer "+brand);
	}
	void playMusic() {
		System.out.println("We can play music on a compueter "+brand);
	}

}
