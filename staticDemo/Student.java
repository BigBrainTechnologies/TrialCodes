package basicPrograms.staticDemo;

public class Student {
	private static String instituteName = "";
	private String studentName ;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static String getInstituteName() {
		return instituteName;
	}

	public static void setInstituteName(String localInstituteName) {
		instituteName = localInstituteName;
	}
	
	
}
