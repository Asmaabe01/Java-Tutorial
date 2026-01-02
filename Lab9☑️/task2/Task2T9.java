package task2;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2T9 {
    public static void main(String[] args) throws Exception {

        // Check correct number of arguments
        if (args.length != 2) {
            System.out.println("Usage: java Task2T9 stringToRemove filename");
            System.exit(1);
        }

        String wordToRemove = args[0];
        File sourceFile = new File(args[1]);

        // Check if file exists
        if (!sourceFile.exists()) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(2);
        }

        // Temporary file (to store modified content)
        File tempFile = new File("temp.txt");

        // Read from source file and write to temp file
        try (
            Scanner input = new Scanner(sourceFile);
            // Open temp file for writing (creates it if it doesn't exist)
            PrintWriter output = new PrintWriter(tempFile);
        ) {
            while (input.hasNextLine()) {
                String line = input.nextLine();

                // Remove the specified string
                line = line.replaceAll(wordToRemove, "");
                //print it to the new file
                output.println(line);
            }
        }
        //delete first file
        // Replace original file with modified file with same name
        sourceFile.delete();
        tempFile.renameTo(sourceFile);
    }
}
