package basicPrograms.staticNonStatic;

import java.io.FileWriter;
import java.io.IOException;

public class PageSeparatorDemo {
    public static void main(String[] args) {
        // Define the content
        String content = "Page 1\n------------\fPage 2";

        // Specify the file path
        String filePath = "output.txt";

        try {
            // Create a FileWriter
            FileWriter writer = new FileWriter(filePath);

            // Write the content to the file
            writer.write(content);

            // Close the FileWriter
            writer.close();

            System.out.println("File \"" + filePath + "\" created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
