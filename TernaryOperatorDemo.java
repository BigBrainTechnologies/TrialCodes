package basicPrograms;


public class TernaryOperatorDemo {
	public static void main(String args[]) {
		int x, y, greater;
		x = 50;
		y = 100;
		
		//Conventional Method
		/*
		if (x > y )
			 greater = x;
		else 
			 greater = y;
			 */
		
		//Ternary Operator
		greater = x > y ? x+10 : y + 10;
	
		
		System.out.println("Greater value is: " + greater);

	}
}