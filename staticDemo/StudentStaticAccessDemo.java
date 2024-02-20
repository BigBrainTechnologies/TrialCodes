package basicPrograms.staticDemo;

public class StudentStaticAccessDemo {
	public static void main(String[] args) {
		
		Student.setInstituteName("CIT");
		
		Student student1 = new Student();
		student1.setStudentName("Aishwarya");
		
		Student student2 = new Student();
		student2.setStudentName("Durga");
		
		Student student3 = new Student();
		student3.setStudentName("Keerthana");
		
		System.out.println(Student.getInstituteName());
		System.out.println(student1.getStudentName());
		System.out.println(student2.getStudentName());
		System.out.println(student3.getStudentName());
		
		//TODO
		//Try to create non static method to access
		//static variable
		//how do you call that
		
		
		
	}
}
