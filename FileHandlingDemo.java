package basicPrograms;



//importing the File class
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System;

public class FileHandlingDemo {
	// create a file object for the current location
	public static File file = new File("c:\\latha\\log.txt");

	public static void createFile() {
		try {

			// create file
			// trying to create a file based on the object
			boolean value = file.createNewFile();
			if (value) {
				System.out.println("The new file is created.");
			} else {
				System.out.println("The file already exists");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	//TODO append contents into file - at the end of the file and mid 
	
	public static void writeIntoFile() {
		try {
			// write file
			// Creates a Writer using FileWriter
			FileWriter output = new FileWriter(file);
			String data = "";
			for (int i = 0; i< 10000; i++)
			 data = data + "Trying to write the contents into file : "
			 		+ "\n\n\n FileHandlingDemo \t Inside class of FileHandlingDemo Inside class of FileHandlingDemo Inside class of FileHandlingDemo Inside class of FileHandlingDemo Inside class of FileHandlingDemo Inside class of FileHandlingDemo Inside class of FileHandlingDemo Inside class of FileHandlingDemo Inside class of FileHandlingDemo Inside class of FileHandlingDemo Inside class of FileHandlingDemo\n";

			// Writes string to the file
			output.write(data);
			System.out.println("Data is written to the file.");
			// Closes the writer
			output.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	public static void readFromFile() {
		try {
			// read file
			FileReader fileReader = new FileReader(file);
			int i;
			while ((i = fileReader.read()) != -1) {
				//System.out.print((char) i);
			}
			fileReader.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	public static void readFromFileUsingBuffer() {

		// read file
		FileReader fileReader;
		try {
			fileReader = new FileReader(file);

			// Creating a BufferedReader object (instance)
		
			String line = "";
			BufferedReader buffer = new BufferedReader(fileReader, 10000);
			while (true) {

				// readLine() method of BufferedReader
				// returns
				// a whole line at a time
				line = buffer.readLine();

				// When the read head reaches the "End Of
				// File" the readLine method returns null
				if (line == null)
					break;

				// Prints the line
				//System.out.println(line);

			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Catch block to handle exceptions
		catch (IOException e) {

			// Print the line where exception
			// occurred
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("File Handling Demo 1");
		long initialTime;

		createFile();

		writeIntoFile();

		initialTime = System.currentTimeMillis();
		readFromFile();
		System.out.println("\nTime taken with normal File Reader(read char by char): " + (System.currentTimeMillis() - initialTime));
		
		  initialTime = System.currentTimeMillis(); readFromFileUsingBuffer(); //TODO -
		  //display time in decimals
		  System.out.println("\nTime taken with buffered Reader: " +
		  (System.currentTimeMillis() - initialTime));
		
	}
}
