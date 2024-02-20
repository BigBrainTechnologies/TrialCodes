package basicPrograms;


public class CharArrayAndForLoop {
    public static void main(String[] args) {
    	BankAccount ba = new BankAccount();
        String str = "hello world";
       
        // convert the string to a character array
        char[] chars = str.toCharArray();
        chars[chars.length + 1] = 'x' ;
              
        // iterate over each character in the array
        for (char c : chars) {
        	System.out.println(c);
        }
        
        
          }
}