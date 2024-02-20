package basicPrograms;

public class CommandLineArgsDemo {

	public static void main(String[] args) {
		// Checking if command line arguments are passed or not
		if (args.length == 0) {
			System.out.println("No command line arguments found.");
		} else {
			System.out.println("Command line arguments:");
			// Printing all the command line arguments
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
	}
}