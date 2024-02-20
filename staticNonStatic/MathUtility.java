package basicPrograms.staticNonStatic;

public class MathUtility {
	public static void main(String[] args) {
		System.out.println(sumOfTwoNumbers(5,10));
		System.out.println(diffOfTwoNumbers(50,10));
		
		Rectangle rectangleWithDefaultConstructor = new Rectangle();
		
		
		Rectangle rectangleOfMyFrame = new Rectangle(7,5);
		
		System.out.println(rectangleOfMyFrame.getArea());
		System.out.println(rectangleOfMyFrame.getPerimeter());
		
	}
	
	
	public static int sumOfTwoNumbers(int x, int y) {
		return x + y;
	}
	
	public static int diffOfTwoNumbers(int x, int y) {
		return x - y;
	}
}

class Rectangle{
	int length;
	int breadth;
	String msg ;
	boolean flag ;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		System.out.println(length);
		System.out.println(breadth);
		System.out.println(msg);
		System.out.println(flag);
	}
	
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
		System.out.println("Rectange created with length and breadth");
		
		System.out.println(length);
		System.out.println(breadth);
		System.out.println(msg);
		System.out.println(flag);
		
	}
	
	public int getArea() {
		return length*breadth;
		
	}
	
	public int getArea(int x, int y) {
		
		if (length == 0 && breadth == 0) {
			length = x;
			breadth = y;
		
		}
		else
		{
			System.out.println("length and width already set");
		
		}
		 return x*y;
	
		
	}
	
	
	public int getPerimeter() {
		return 2 * (length + breadth);
		
	}
}
