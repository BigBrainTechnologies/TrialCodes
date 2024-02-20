package basicPrograms;

import java.util.Scanner;



public class Student2 {
//object variables or instance data member or instance variables
	private String studName;

	private String relationShip;

	private String FriendName;

	private int standard;

	private char Section;

	public static final String schoolName = "BBT";

	public String getStudName() {
		// System.out.println(studName);
		return studName;
	}

	public void setStudName(String lstudName) {
		this.studName = lstudName;
		System.out.println("set the name of " + this.studName);
	}

	public String getRelationShip() {
		return relationShip;
	}

	public void setRelationShip(String relationShip) {
		this.relationShip = relationShip;
	}

	public String getFriendName() {
		return FriendName;
	}

	public void setFriendName(String friendName) {
		FriendName = friendName;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public char getSection() {
		return Section;
	}

	public void setSection(char section) {
		Section = section;
	}

	public static void firstAndSecondObjectCreation() {
		Student2 objStudent2 = new Student2();
		objStudent2.setStudName("Athira");
		objStudent2.setFriendName("Latha");
		objStudent2.setRelationShip("Best");
		objStudent2.setStandard(12);
		objStudent2.setSection('f');

		System.out.println("first object creation " + objStudent2.getStudName());
		System.out.println("first object creation " + objStudent2.schoolName);
		System.out.println("first object creation " + schoolName);
		// schoolName = "BBTS";
		System.out.println("End");
	}


	
	public static void stringPoolMemoryOrObjectMemory() {
		String s3 = new String("Dharani ");
		String s4 = "Aishwarya";
	
		
		s3 = s4.intern();
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		
		String s5 = new String ("BBT");
		s5.charAt(0);
		System.out.println(s5 + s3);
		
		//StringBuffer

	}
	
	  public  int hashCode() {
		  return 0;
	  }
	    public boolean equals(Student obj) {
	       //TODO compare marks
	    	return true;
	    }
	public static void readFromConsole() {
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Kindly enter values :");
		String firstInput = consoleInput.nextLine();
		System.out.println("Entered values " + firstInput);

		String secondInput = consoleInput.nextLine();
		System.out.println("Entered values " + secondInput);

		int thirdInput = consoleInput.nextInt();
		System.out.println("Entered values " + thirdInput);
	}

	public static void arrayCreation() {
		String currentStudName;
		Student currentStudentObj;
		Student studentArr[] = new Student[5];
		currentStudentObj = new Student();
		studentArr[0] = currentStudentObj;
		studentArr[0].setStudName("Dharani ");
		currentStudName = studentArr[0].getStudName();
		System.out.println("Current Student Name is " + currentStudName);

	}

	public static void arrayObjectsCreationInLoop() {
		String currentStudName;
		//Student currentStudentObj;
		Student studentArr[] = new Student[5];
		// currentStudentObj = new Student();

		for (int i = 0; i < 5; i++) {
			studentArr[i] = new Student();
			studentArr[i].setStudName("Dharani " + i);
		}

		for (int i = 0; i < 5; i++) {
			currentStudName = studentArr[i].getStudName();
			System.out.println("stored Student Name in array of element .... " + i + "  " + currentStudName);
		}

	}

	public static void setNameInLoop() {
		String currentStudName;
		Student currentStudentObj;
		Student studentArr[] = new Student[5];
		currentStudentObj = new Student();
		studentArr[0] = currentStudentObj;
		for (int i = 0; i < 5; i++) {
			studentArr[0].setStudName("Dharani " + i);
			studentArr[0].getStudName();
		}

		currentStudName = studentArr[0].getStudName();
		System.out.println("Current Student Name is " + currentStudName);

	}
}
