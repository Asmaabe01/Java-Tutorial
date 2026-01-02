import java.util.Scanner;
public class currency {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate=input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convert=input.nextInt();

        if(convert==0){
            System.out.print("Enter the dollar amount: ");
            double dollar=input.nextDouble();
            System.out.println("$" +dollar+" is "+ dollar* rate+ " yuan");
        }
        else if(convert==1){
            System.out.print("Enter the RMB amount: ");
            double RMB=input.nextDouble();
            System.out.println(RMB+" yuan is $"+ RMB/ rate);
        }
        else
        System.out.println("Invalid Input!!! input 1 or 0.");
    }
    
}
 