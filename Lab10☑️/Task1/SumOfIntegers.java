package Task1;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    while(true){
        try{
            System.out.println("Input the first integer: ");
            int int1=Integer.parseInt(input.nextLine());

            System.out.println("Input the second integer: ");
            int int2=Integer.parseInt(input.nextLine());

            System.out.println("sum is: "+ int1+int2);
            break;
        }catch(NumberFormatException e){
            System.out.println("Incorrect input!! Please enter an integer again.");

        }
    }
        //this code will work until it breaks 
        // and won't break until the input is matching our requirements
        input.close();
    }
}
// We use NumberFormatException when we use Integer.parseInt()
// and we use InputMismatchException when we use Scanner.nextInt()
