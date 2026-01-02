import java.util.Scanner;
public class TestEquation{
public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter values for: ");
    System.out.print("a: ");
    double a=input.nextDouble();
    System.out.print("b: ");
    double b=input.nextDouble();
    System.out.print("c: ");
    double c=input.nextDouble();

    QuadraticEquation E=new QuadraticEquation(a, b, c);

    double result1=E.getRoot1();
    double result2=E.getRoot2();

    if(E.getDiscriminant()>0){
        System.out.println("The result is: Root1= "+result1+ " and Root2= "+ result2);
    }else if(E.getDiscriminant()==0){
        System.out.println("The result is: Root1= "+result1);
    }
    else
        System.out.println("The equation has no roots.");

}
}