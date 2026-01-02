import java.util.Scanner;
public class TestProgram{
    public static int binaryToDecimal(String binaryString){

        int DC=0;
        for(int i=0;i< binaryString.length();i++){
            DC = DC *2 +(binaryString.charAt(i)- '0');
        }

        return DC;
    }
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binary=input.nextLine();

        int Decimal=binaryToDecimal(binary);
        System.out.println("The decimal integer value is: "+ Decimal);


    }
}