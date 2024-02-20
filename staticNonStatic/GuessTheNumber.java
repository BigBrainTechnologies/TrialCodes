package basicPrograms.staticNonStatic;


import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args)
    {
        int randomvalue, guess;
        final int MAX = 100;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        randomvalue = rand.nextInt(MAX) + 1;
        int count=0;
        System.out.println("let us play a game ");
        System.out.println("i have a secrete number in my mind u have to guess that number  ");
        
        while (true) {
            count+=1;
            int x=4-count;
            if(count<=3){
                System.out.println("u have '"+x+"' chances");
            }
            else{
                System.out.println("u r un luckey");
                System.exit(0);
            }
            System.out.println("Guess a number between 1 and 100: ");
            guess = in.nextInt();
            if (guess > randomvalue) {
                System.out.println("Too high");
            }
            else if (guess < randomvalue) {
                System.out.println("Too low");
            }
            else {
                System.out.println("Yes, you won");
                if(count==1){
                    System.out.println("i think u can read my mind");
                }
                else{
                System.out.println("next time try to guess the number less than "+count+" chances");
                }
                System.exit(0);            }
        }
    }
}
                