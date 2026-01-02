package Task5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DigitPatternSum {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int a=-1;// initialized with an invalid value so we know it is not set yet
        int n=-1;

        while(true){
            try{
                System.out.println("Enter a digit 0-9");
                a=input.nextInt();
                if(a<0 || a>9){
                    System.out.println("invalid input .please enter a single digit 0-9");
                }else{
                    break;// Valid digit entered → exit the loop
                }
            }catch(InputMismatchException e){
                System.out.println("Please enter an integer!!");
                input.nextLine(); // Clear the wrong input so Scanner can continue
            }
        }

        while(true){
            try{
                System.out.println("Enter how many numbers to add (positive integer): ");
                n=input.nextInt();
                if(n<=0){
                    System.out.println("invalid input .please enter a positive integer!");
                }else{
                    break;
                }
            }catch(InputMismatchException e){
                System.out.println("Please enter an integer!!");
                input.nextLine();
            }
        }

        long term=0;//For larger n (like 23), int can overflow and become negative.
        long sum=0;// so we use long instead of int

        for(int i=0;i<n;i++){
            term=term*10+a;
            sum+=term;
        }

        System.out.println("the sum is: "+ sum);

        input.close();


    }
}
