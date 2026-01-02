import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        final double EGPexchangeRate=13.5367;

        Scanner sc=new Scanner(System.in);
        System.out.print("How much money in Australian dollars you want to exchange: ");
        double AUD=sc.nextDouble();

        double EGP=EGPexchangeRate*AUD;

        System.out.println("You will receive: "+ EGP+ " Egyptian pounds");


    }
    
}
