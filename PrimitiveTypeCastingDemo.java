package basicPrograms;



//21Jan
public class PrimitiveTypeCastingDemo {
	
	//Converting one primitive datatype into another is known as type casting
	
	//Java converts shorter data types to larger data types when they are assigned to the larger variable.
	
	 public static void main(String[] args) {

		 short s = 128;
		 byte b = (byte) s;
		 System.out.println(b);
		 
		 
		 b = 127;
		 System.out.println("Assigned value directly " + b);
		 
		 System.out.println("Byte max value is " + Byte.MIN_VALUE);
		 System.out.println("Byte max value is " + Byte.MAX_VALUE);
		 
		 b = (byte) -130;
		 //TODO check for max and thrown an user defined exception 
		 System.out.println("Assigned value "
		 		+ "directly higher than what "
		 		+ "can be stored " + b);
		 
		 
			/*
			 * float y = (int) 3.2; System.out.println(y);
			 * 
			 * y = 3.505f; System.out.println(y);
			 * 
			 * y = 3f; System.out.println(y);
			 * 
			 * int x = 3; y = x * 0.1f; System.out.println(y);
			 * 
			 * double z = 45.95; x = (int)z; System.out.println(x);
			 */
			
	}
}

