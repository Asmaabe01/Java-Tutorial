package Task2;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        
        //creates array named arr can store 100 int
        int[] arr=new int [100];
        //creates Random numbers generator 
        Random rand= new Random();
        Scanner input=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(100);
        }//generate 100 numbers from 0 to 99 index

        while(true){
            try{
                System.out.print("Input and index: ");
                int index=input.nextInt();
                System.out.println("Value at index " + index + " is: " + arr[index]);
                break;

            }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");

            }catch (InputMismatchException e) {
                System.out.println("Please enter an integer index");
                input.next(); // clear invalid input
        }
    }
         input.close();

    }
    
}
