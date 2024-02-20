package basicPrograms;
public class PassByValueUsingIntDataType {
    public static void main(String[] args) {
        int balance = 100000;
        System.out.println("Your Balance is " + balance);
        addBonus(balance);
        System.out.println("After calling method or from Caller - Your Balance is : " + balance);
        balance = getBalanceWithBonus(balance);
        System.out.println("After calling method With Values Returned - Your Balance is : " + balance);
    }
    
    public static void  addBonus(int n) {
        if (n > 50000)
        	n = n + 1000;
        System.out.println("(Within Called Method) Added Bonus & your current balance is  " + n);
     
    }
    
    
 public static int getBalanceWithBonus(int n) {
	   if (n > 50000)
       	n = n + 1000;
        System.out.println("(in Called Method of getBalanceWithBonus) Added Bonus & your current balance is  " + n);
        return n;
    }

}