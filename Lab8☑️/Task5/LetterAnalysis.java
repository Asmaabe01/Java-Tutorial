import java.util.Scanner;
public class LetterAnalysis {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Input a String: ");
        String word=input.nextLine();

        int upperCount=0;
        int lowerCount=0;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCount++;
            }
            if(Character.isLowerCase(ch)){
                lowerCount++;
            }    
        }

        System.err.println("There are "+upperCount+" upper case letters");
        System.err.println("There are "+lowerCount+" lower case letters");

    }
}
