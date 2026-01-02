package task3;
import java.io.File;
import java.util.Scanner;

public class LetterOccurrences {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        // Prompt user for file name
        System.out.print("Enter a filename: ");
        String filename = input.nextLine();

        File file = new File(filename);

        // Check if file exists
        if (!file.exists()) {
            System.out.println("File does not exist.");
            System.exit(1);
        }

        // Array to count occurrences of letters A-Z
        int[] counts = new int[26];

        // Scanner to read from file
        Scanner sc = new Scanner(file);

        // Read file line by line
        while (input.hasNextLine()) {
            String line = sc.nextLine();

            // Convert line to uppercase (case-insensitive)
            line = line.toUpperCase();

            // Check each character in the line
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);//take one character from the line

                // Check if character is a letter A-Z
                if (ch >= 'A' && ch <= 'Z') {
                    counts[ch - 'A']++;//if ch is A so A-A=0 -> counts[0] will increment from 0 to 1
                }
            }
        }

        sc.close();
        input.close();

        // Display results
        for (int i = 0; i < counts.length; i++) {
            System.out.println(
                "Number of " + (char)('A' + i) + "'s: " + counts[i]
                //i is 0 -> (char)(A+0) = (char)(65+0) = (char)(65) = 'A'
                // count[0]=display how many letters 
            );
        }
    }
}
