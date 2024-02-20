package basicPrograms;

public class CommandLineArgumentDemo2 {
	public static void main(String[] args) {

		// commandLineArguments is the array that gets created when you pass command
		// line arguments
		// length is the data member that contains the number of array elements

		System.out.println("User entered values are " + args.length);

		/*
		 * for (int i = 0; i < commandLineArguments.length; i++) {
		 * System.out.println("User entered values are " + commandLineArguments[i]);
		 * 
		 * System.out.println("User entered values is printed ....."); }
		 */

		String y = args[0];
		
		Integer i =  Integer.parseInt(y);
		//Float
		
		System.out.println("Converting string to integer and then float " +i.floatValue() );
		
		
		//int total = (int) args[0] +  args[1]; 
		int total = Integer.parseInt( args[0]) +  Integer.parseInt(args[1]); 
		//Wrapper Class
		float x = Float.parseFloat(args[1]);
		//Integer objReferenceVariable = new Integer(9999);//autoboxing
		Integer objReferenceVariable = 98;//autoboxing
		System.out.println("Reversed value is " + Integer.reverse(78));
		//objReferenceVariable.toString();
	//	int  z = objReferenceVariable;//auto unboxing
		System.out.println("User entered values is printed .....z... " + objReferenceVariable.doubleValue());
		
		

		System.out.println("User entered values is printed ....." + y);
		System.out.println("User entered values is printed ....." + x);
		
		//RuntimeException is possible?
		
		//func1 ()
	}
	
	/*
	 * func1 { func2() next..clone(). }
	 * 
	 * func2 { --- --- Exception --
	 * 
	 * }
	 */
	
	
}
