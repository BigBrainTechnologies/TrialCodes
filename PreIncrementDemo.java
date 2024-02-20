package basicPrograms;


public class PreIncrementDemo {

      public static void main(String args[]) 
      {        
       
           
          int x=5,y=10, a;
          a = 0;
      
          	// pre or post increment without part of expression
     	 	
          	//Method 1
    		 a = x++ + ++y;
    		 
    		 //Method 2
    		 a = x + (y + 1);
    		 x++;
    		 ++x;
    		 
     		 System.out.println(x );
     		System.out.println(y );
            System.out.println("value of a is " + a);
            
             // pre or post increment without part of expression
       	 	 ++x;
    		 System.out.println(x );
    		 
    		 //TODO - try with i++ and ++i
    		 //for (int i)
    		 
    		 
    		 
    		 int g = 3;
             System.out.println (g++ * (8 + 2));
             System.out.println("g is " + g);
            
      
      } 
  }