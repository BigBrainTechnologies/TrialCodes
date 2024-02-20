package basicPrograms;


public class EnumWithDataDemo {

	enum LoggerLevel {
		LOW, MEDIUM, HIGH
	}

	public static void main(String[] args) {

		LoggerLevel myVar = LoggerLevel.MEDIUM;
		
		if (myVar == LoggerLevel.MEDIUM)
			System.out.println("Medium Logger Level");
		else
			System.out.println("Other Logger Level");
		

	}

}