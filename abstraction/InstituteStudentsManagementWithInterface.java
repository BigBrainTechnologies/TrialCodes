package basicPrograms.abstraction;



interface Institute {
	
	 String instituteName = "CIT";

	 public String getInstituteName() ;

	 public String secondMethod();
	

}



class DayScholarStudent implements Institute{
	int routeNoOfTravel ;
	
	 public String getInstituteName() {
		// instituteName = instituteName + " Evening C";
		 return instituteName ;
	 }

	 public String secondMethod() {
		 return "";
	 }

	
}




class EveningCollegeStudent implements Institute{
	 public String getInstituteName() {
		 return instituteName + " Evening College";
	 }

	 public String secondMethod() {
		 return "";
	 }

	
}

public class InstituteStudentsManagementWithInterface {
	public static void main(String[] args) {
		
		DayScholarStudent keerthana = new DayScholarStudent();
		System.out.println(keerthana.getInstituteName());

		EveningCollegeStudent ec = new EveningCollegeStudent();
		System.out.println(ec.getInstituteName());
	}
	/*
	 * public static void callStudent() { Student aishwarya = new Student(); //TODO
	 * autogenerate Student ID //accept data from user
	 * aishwarya.setStudName("   Aishwarya  ");
	 * 
	 * //validate all data
	 * 
	 * //store the data in database
	 * 
	 * //retrieve for further processing like certificate printing
	 * System.out.println(aishwarya.getStudName());;
	 * 
	 * 
	 * aishwarya.displayAllDetails();
	 * 
	 * }
	 */
}
