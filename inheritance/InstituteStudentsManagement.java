package basicPrograms.inheritance;

abstract class Student {
	

	protected int studId = 1;
	private String studName;
	// TODO

	public int getStudId() {
		return studId;
	}

	abstract public String generateStudentID();

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		// validate student Name

		
		System.out.println("Length before trimming of space " + studName.length());
		studName = studName.trim();
		System.out.println("Length before trimming of space " + studName.length());
		if (validateStudentName(studName))
			this.studName = addTitle(studName);
		//TODO do it based on gender and maritalStatus
		else
			System.out.println("Not a valid name");
	}

	private String addTitle(String studName ) {
		return "Ms. " + studName;
	}
	
	private boolean validateStudentName(String name) {

		if (name.isEmpty())
			return false;
		else
			return true;

		// TODO - check for special char and numbers
	}
	
	public  void displayAllDetails() {
		System.out.println("Details of student ");
		System.out.println("ID is " + generateStudentID());
	
		System.out.println("Name is " + studName);
	}

}



final class DayScholarStudent extends Student{
	int routeNoOfTravel ;
	public String generateStudentID() {
		return "DS" + studId;
	}
	
	public int getRouteNoOfTravel() {
		return routeNoOfTravel;
	}

	public void setRouteNoOfTravel(int routeNoOfTravel) {
		this.routeNoOfTravel = routeNoOfTravel;
	}
	
	
	public final void displayAllDetails() {
		super.displayAllDetails();
		System.out.println(studId);
		System.out.println("route no. is " + routeNoOfTravel) ;
	}
	
	
}

//Observe compilation error 
//when you over ride the final method 
/*
 * class DSDerived extends DayScholarStudent{ public void displayAllDetails() {
 * 
 * } }
 */


//Observe compilation error 
//when you extend the final class

/*
 * class DSDerived extends DayScholarStudent{ public void displayAllDetails() {
 * 
 * } }
 */

class HostelStudent extends Student{
	//TODO 
	
	public String generateStudentID() {
		return "H" + studId;
	}
}


class EveningCollegeStudent extends Student{

	@Override
	public String generateStudentID() {
		// TODO Auto-generated method stub
		return "EC" + studId;
	}
	
}

public class InstituteStudentsManagement {
	public static void main(String[] args) {
		
		DayScholarStudent keerthana = new DayScholarStudent();
		keerthana.setStudName("       Keerthana     ");
		keerthana.setRouteNoOfTravel(12);
		keerthana.displayAllDetails();

		EveningCollegeStudent ec = new EveningCollegeStudent();
	//	ec.generateStudentID();
		ec.displayAllDetails();
		
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
