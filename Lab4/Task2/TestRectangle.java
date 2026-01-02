import java.util.Scanner;

public class TestRectangle{
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Please input the width of the Rectangle: ");
        double len=input.nextDouble();
        System.out.println("Please input the length of the Rectangle: ");
        double wid=input.nextDouble();

        Rectangle R1=new Rectangle(len,wid);
        System.out.println("The area of the rectangle is: "+ R1.getArea());
        System.out.println("The perimeter of the rectangle is: "+ R1.getPerimeter());
        R1.drawRect();

    }
}