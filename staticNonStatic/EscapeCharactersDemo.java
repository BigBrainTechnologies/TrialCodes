package basicPrograms.staticNonStatic;

public class EscapeCharactersDemo {
    public static void main(String[] args) {
        // Using escape characters in Java strings

        // 1. Newline character
        System.out.println("Hello\nWorld");
        
        // another  Newline character
        System.out.println("Hello\rWorld");
        
        // next page
        //Try to write in a file

                System.out.println("Page 1");
                System.out.println("\f"); // Form feed character
                System.out.println("Page 2");
   
        
        // 2. Tab character
        System.out.println("Hello\tWorld");
        
        // 3. Backslash itself
        System.out.println("This is a backslash: \\");
        
        // 4. Double quote
        System.out.println("She said, \"Hello!\"");
        
        // 5. Single quote (for character literals)
        char singleQuoteChar = '\'';
        System.out.println("Single quote character: " + singleQuoteChar);
        
        // 6. Unicode escape sequence
        //   - Unicode for the letter 'A' is 65
        System.out.println("Unicode for 'A' is: " + '\u0041');
    
    
    }
}
