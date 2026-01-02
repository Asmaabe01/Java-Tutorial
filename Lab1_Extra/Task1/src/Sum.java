import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        int sum=0;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int num=input.nextInt();
    
        while (num > 0) {
            sum += num % 10;  
            num = num / 10;   
        }

        System.out.println("The sum of the digits is: "+ sum);
        
    }
}
