package basicPrograms;

import java.io.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

class DateTimeDemo {
	public static void main(String[] args) {

		try {
			// Unix/Solaris/Linux /root/folder
			String filePathAndName = "C:\\Latha\\BBT\\JavaCodeSamples\\output\\test1.csv";
			FileWriter myWriter = new FileWriter(filePathAndName);

			// boolean result = file.createNewFile();
//Write a loop to create n number of lines
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMM/dd E  HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();

			for (int i = 0; i < 25000; i++) {
				now = LocalDateTime.now();

				System.out.println(dtf.format(now));

				System.out.println("success1,success2,success3 for " + i);
				
				
				// Set the time zone to Hamilton, Ontario
		        ZoneId hamiltonZone = ZoneId.of("America/Toronto");
		        
		        // Get the current date and time in Hamilton
		        LocalDateTime hamiltonTime = LocalDateTime.now(hamiltonZone);
		        
		        // Format the time in the desired format
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		        String formattedTime = hamiltonTime.format(formatter);
		        
		        // Display the time in Hamilton
		        System.out.println("The current time in Hamilton, Ontario is: " + formattedTime);
		        myWriter.write(dtf.format(now) + ",success1,success2,success3," + formattedTime + "," + "\n");		    
			}

			myWriter.close();

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
