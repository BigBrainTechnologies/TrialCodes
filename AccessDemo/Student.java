package basicPrograms.AccessDemo;

public class Student {
	private String objVariablestudName;
	 private String collegeName;
	 
	 Student(){
		 setCollegeName("CIT");
	 }
	 
	 Student(String localVariablecollegeName){
		 setCollegeName(localVariablecollegeName);
	 }
	
	private void verifyStudentName() {
		System.out.println("I am verifying student name ");
	}
	private void secondPrivateMethod() {
		verifyStudentName();
	}
	public void setStudName(String localVariablestudentName) {
		objVariablestudName = localVariablestudentName;
		verifyStudentName();
	}

	public String getStudName() {
		return objVariablestudName;
	}
	
	//TODO
	//Callee
	public void getMarks() {
		
	}
	
	
	//Caller
	public void getTotal() {
		//TODO
		//arraylistobj = getMarks();
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
}

