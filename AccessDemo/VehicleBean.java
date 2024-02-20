package basicPrograms.AccessDemo;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class VehicleBean implements Serializable{

	


	public String getVehicleNumber() {
		return vehicleNumber;
	}




	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}




	public int getSeatingCapacityExcludingDriver() {
		return SeatingCapacityExcludingDriver;
	}




	public void setSeatingCapacityExcludingDriver(int seatingCapacityExcludingDriver) {
		SeatingCapacityExcludingDriver = seatingCapacityExcludingDriver;
	}




	public char getTransmissionType() {
		return TransmissionType;
	}




	public void setTransmissionType(char transmissionType) {
		TransmissionType = transmissionType;
	}




	private String vehicleNumber;
	private int SeatingCapacityExcludingDriver;
	private char TransmissionType;
	
	

	
	public static void main(String[] args) {
		 VehicleBean vehicleBean = new VehicleBean();
		 vehicleBean.setVehicleNumber("TN01 5567");
		 vehicleBean.setSeatingCapacityExcludingDriver(4);
		 vehicleBean.setTransmissionType('F');
	        
		 String filename = "vehicledata.ser";
	          
	        // Serialization 
	        try
	        {   
	            //Saving of object in a file
	            FileOutputStream file = new FileOutputStream(filename);
	            ObjectOutputStream out = new ObjectOutputStream(file);
	              
	            // Method for serialization of object
	            out.writeObject(vehicleBean);
	              
	            out.close();
	            file.close();
	              
	            System.out.println("Object has been serialized");
	  
	        }
	          
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	  
	  
	        VehicleBean vehicleBeanReadFromFile = new VehicleBean();
	  
	        // Deserialization
	        try
	        {   
	            // Reading the object from a file
	            FileInputStream file = new FileInputStream(filename);
	            ObjectInputStream in = new ObjectInputStream(file);
	              
	            // Method for deserialization of object
	            vehicleBeanReadFromFile = (VehicleBean)in.readObject();
	              
	            in.close();
	            file.close();
	              
	            System.out.println("Object has been deserialized ");
	            System.out.println("a = " + vehicleBeanReadFromFile.getVehicleNumber());
	            System.out.println("b = " + vehicleBeanReadFromFile.getSeatingCapacityExcludingDriver());
	            System.out.println("b = " + vehicleBeanReadFromFile.getTransmissionType());
	        }
	          
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	          
	        catch(ClassNotFoundException ex)
	        {
	            System.out.println("ClassNotFoundException is caught");
	        }

	}

}
