import java.util.Scanner;
public class MyTriangle {
    public static boolean isValid(double side1, double side2, double side3){
           return (side1+side2>side3 && side1+side3>side2 && side2+side3>side1);

        }
        public static double area(double side1, double side2, double side3){
            double s=(side1+side2+side3)/2;
            return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Provide the side1 of the triangle: ");
        double s1=input.nextDouble();
        System.out.println("Provide the side2 of the triangle: ");
        double s2=input.nextDouble();
        System.out.println("Provide the side3 of the triangle: ");
        double s3=input.nextDouble();

        if(isValid(s1,s2,s3)){
            double area = area(s1, s2, s3);
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("The input is invalid. The sum of any two sides must be greater than the third side.");
        } 
        
        input.close();
    }

}
