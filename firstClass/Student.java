package basicPrograms.firstClass;

public class Student {
	 int rollNo = 0;
	private String studName = "";
	private static String instituteName = "SathyaBhama";

	
	public static void main(String[] args) {
		//object reference variables 
		
		Student.setInstituteName();
		
		
		Student stud1 = new Student();
		stud1.setStudName("Pradeep ");
		
		stud1.displayStudName();
		
	}
	
	public static void setInstituteName() {
		instituteName = "SathyaBhama";
	}
	
	public void setStudName(String localStudName ) {
		studName = localStudName;
	}
	
	public void displayStudName() {
		System.out.println("Student Name is " + studName);
	}
	
}
