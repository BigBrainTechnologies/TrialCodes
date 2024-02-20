package basicPrograms;


//session 7
import java.util.*;

public class DownCastingAndGenericsDemo {

	public static void main(String[] args) {
		// Q : Using generics - Can we do without generics ?
		ArrayList<SmartPhoneT2> listOfPhones = new ArrayList<>();

		listOfPhones.add(new SamsPhone());
		listOfPhones.add(new ApplePhone());

		for (int i = 0; i < listOfPhones.size(); i++) {
			System.out.println(listOfPhones.get(i));
			listOfPhones.get(i).makeCall();

			// listOfPhones.get(i).uniqueFeatureOfSamsung();

			if (listOfPhones.get(i) instanceof SamsPhone)
				((SamsPhone) listOfPhones.get(i)).uniqueFeatureOfSamsung();

			if (listOfPhones.get(i) instanceof ApplePhone)
				((ApplePhone) listOfPhones.get(i)).uniqueFeatureOfApple();

		}
	}

}

class SmartPhoneT2{
	// LL : no return data type for Constructor
	SmartPhoneT2() {
		System.out.println("constructor");
	}

	public void makeCall() {
		System.out.println("To make calls");
	}
}

class SamsPhone extends SmartPhoneT2 {
	public void uniqueFeatureOfSamsung() {
		System.out.println("uniqueFeatureOfSamsung");
	}

	public void makeCall() {
		System.out.println("To make calls from samsung");
	}
}

class ApplePhone extends SmartPhoneT2 {
	public void uniqueFeatureOfApple() {
		System.out.println("uniqueFeatureOfApple");
	}

	public void makeCall() {
		System.out.println("To make calls from apple");
	}
}

//Q : Using generics - Can we do without generics ?
//if class name is not specified, downcast and call the base class method
//((SmartPhoneDCD) listOfPhones.get(i)).makeCall();