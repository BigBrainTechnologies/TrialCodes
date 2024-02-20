package basicPrograms;

public class ProgramWithoutException {


    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0; // Division by zero will lead to an exception

        int result = numerator / denominator; // This line will cause an exception

        System.out.println("Result: " + result); // This line will not be executed
    }
}
