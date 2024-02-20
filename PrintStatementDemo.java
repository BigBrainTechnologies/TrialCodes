package basicPrograms;

public class PrintStatementDemo {
	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		
		int z = 'a';
		
		//Not allowed 
		//String cannot be stored in int primitive data types
		
		//int a = "a";
		System.out.println("Value to display is " + x + y);
		System.out.println("Value to display is " +(  x + y));
		
		
		System.out.println( x + y);
		System.out.println( x + y + " is the value to display");
		
		System.out.println("Ascii value of a is " + z);
	}
}
