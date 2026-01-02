package task1;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws Exception {

        // 1. Check correct number of command-line arguments
        if (args.length != 4) {
            System.out.println(
                "Usage: java ReplaceText sourceFile targetFile oldString newString");
            System.exit(1);
        }

        // 2. Create File object for source file
        File sourceFile = new File(args[0]);

        // Check if source file exists
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // 3. Create File object for target file
        File targetFile = new File(args[1]);

        // Check if target file already exists
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        // 4. Read from source file and write to target file
        try (
            Scanner input = new Scanner(sourceFile);
            PrintWriter output = new PrintWriter(targetFile);
        ) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String newLine = line.replaceAll(args[2], args[3]);
                output.println(newLine);
            }
        }
    }
}
