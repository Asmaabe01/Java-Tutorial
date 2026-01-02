package task4;
    
import java.util.Scanner;

public class CommonPrefix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();

        String commonPrefix = prefix(s1, s2);
        
        if (commonPrefix.isEmpty()) {
            System.out.println("The strings have no common prefix.");
        } else {
            System.out.println("The common prefix is: " + commonPrefix);
        }

        input.close();
    }

    public static String prefix(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        //Math.min(a, b) is Java method that returns the smaller of 2 numbers
        StringBuilder commonPrefix = new StringBuilder();
        //This creates empty StringBuilder
        // like an empty box where we'll put characters

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                commonPrefix.append(s1.charAt(i));
                //If the characters match this line
                // adds the character to our StringBuilder.
            } else {
                break;
            }
        }

        return commonPrefix.toString();//converting to String
    }
}
//String result = "";
//for (int i = 0; i < minLength; i++) {
//  if (s1.charAt(i) == s2.charAt(i)) {
//       result = result + s1.charAt(i); 
//  }} other way instead of string builder