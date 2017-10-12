import java.util.Scanner;

public class Methods {
	
	// Called a constructor, this code block is run
	// when the object is first created, and can take
	// arguments like "exampleString". You do not need
	// to always have a constructor for a class, however.
	public Methods(String exampleString) {
		printOut(exampleString, 5);
		printOut("\n", 2);
		printOut("This won't print", -1);
		
		printOut("This is called \"Method Overloading\", which allows two methods");
		printOut("to have the same name but with different arguments");
		
		printOut("17 squared is " + square(17));
		printOut("17 cubed is " + cube(17));
		
		double negativePi = -3.14159265;
		printOut(negativePi + " squared is " + square(negativePi));
	}
	
	public static void main(String[] args) {
		new Methods("I'm in the constructor of my object!");
		System.out.print("Tell me something, anything: ");
		String input = getKeyboardInput();
		System.out.println("\n" + "Sorry, I don't quite understand, \"" + input + "\"");
	}
	
	private static String getKeyboardInput() {
			Scanner keyboard_input = new Scanner(System.in);
			return keyboard_input.nextLine();
	}
	
	// public = visible anywhere within the class, or to any other classes.
	public void printOut(String str, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(str);
		}
	}
	
	// no access-modifier = visible and can by called by any member of the 
	//						same module, also called a package.
	void printOut(String str) {
		System.out.println(str);
	}
	
	// private = not visible to outside classes
	// double = returns a double to the code block that called it
	private double square(double number) {
		return number*number;
	}
	
	// protected = visible only to subclasses, i.e. only this class
	// 			   or a class that extends this class can call this method.
	protected double cube(double number) {
		return square(number)*number;
	}
}