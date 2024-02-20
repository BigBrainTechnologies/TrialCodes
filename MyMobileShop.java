package basicPrograms;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class MyMobileShop {
	public static void main(String[] args) {
		DurgaMobile phone1 = new DurgaMobile("Redmi");
		phone1.displayFeaturesOfDurgaMobile();
		
		DurgaMobile phone2 = new DurgaMobile("Samsung");
		phone2.displayFeaturesOfDurgaMobile();
		
		DurgaMobile[] phones = new DurgaMobile[5];
		
		phones[0] = new DurgaMobile("Iphone");
		
		phones[1] = new DurgaMobile("Oppo");
		
		System.out.println("current array length is " + phones.length);
		int j  = 0;
		for (int i = 0; i < phones.length; i++) {
			 j = 0;
			if (phones[i] != null)
			phones[i].displayFeaturesOfDurgaMobile();
		}
			
		enhancedForLoop();
		
	}
	
	
	public static void allTypesOfLoopDemo(){
		//prompt user whether he wants to start or continue
		//accept true or false
		//do set of statements only while the selection is true
		
		/*
		 * for (int i = 0;true ;) {
		 * 
		 * if () System.out.println("Successful Attempt"); }
		 */
		
		boolean continueSuccess = true;
		Scanner bContinueSuccess = new Scanner(System.in);
		
		do {
			System.out.println("Confirm whether you would like to continue"); 
			continueSuccess = bContinueSuccess.nextBoolean();
			if (!continueSuccess)
				break;
			System.out.println("Successful Attempt"); 
		}while (continueSuccess);
		
		//TODO 
		//write the same using while loop and for loop
	}
	
	public static void enhancedForLoop() {
		
		
		DurgaMobile[] phones = new DurgaMobile[5];
		
		phones[0] = new DurgaMobile("Iphone");
		
		phones[1] = new DurgaMobile("Oppo");
		
		int i = 0;
		for (DurgaMobile phone : phones) {
			System.out.println("Using enhanced for loop " + i++);
		    // Code to be executed for each element
			if (phone != null)
			phone.displayFeaturesOfDurgaMobile();
		}

		
		
		
	}
}
