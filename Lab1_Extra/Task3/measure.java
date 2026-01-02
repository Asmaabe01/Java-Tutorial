import java.util.Scanner;
public class measure{
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight=input.nextDouble();
        System.out.println("Enter height in inches: ");
        double height=input.nextDouble();

        double weightInKg=weight*0.45359237;
        double heightInMetere=height*0.0254;

        double BMI=weightInKg/(Math.pow(heightInMetere,2));
        
        System.out.println("BMI is: "+ BMI);
    }
}
