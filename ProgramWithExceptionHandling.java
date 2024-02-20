package basicPrograms;

import java.util.Scanner;

public class ProgramWithExceptionHandling {
    public static void main(String[] args) {
    	ProgramWithExceptionHandling pe = new ProgramWithExceptionHandling();
    
    	System.out.println(pe.toString());
    	System.out.println(pe.hashCode());
    	System.out.println(pe.getClass());
   
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            if (denominator == 0) 
            	throw new ArithmeticException();
            	
            int result = divide(numerator, denominator);

            System.out.println("Result: " + result);
        } catch (Exception e ) {
        	System.out.println("Common Exception handling " + e);
        	e.printStackTrace();
        }
        
        finally {
            System.out.println("Visit us again!");
            scanner.close();
        }
    }

    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}
