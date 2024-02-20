package basicPrograms.AccessDemo;


public class AccessSpecifierDemo {
	public static void main(String[] args) {
		Student stud1 = new Student();
		
		
		stud1.setStudName("Durga");
		
		//stud1.objVariablestudName = "Latha";
		
		System.out.println(stud1.getStudName() + " in " + stud1.getCollegeName());
		
		
		
		Student stud2 = new Student();
		
		stud1.setStudName("Keerthana");
		
		
		System.out.println(stud1.getStudName() + " in " + stud1.getCollegeName());
		
	}

}
