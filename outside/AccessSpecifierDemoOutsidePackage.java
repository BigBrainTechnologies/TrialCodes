package basicPrograms.outside;

import basicPrograms.AccessDemo.Student1;

public class AccessSpecifierDemoOutsidePackage {
	public static void main(String[] args) {
		Student1 stud1 = new Student1();
		stud1.setStudName("Durga");
		stud1.objVariablestudName = "Latha";


	}

}
