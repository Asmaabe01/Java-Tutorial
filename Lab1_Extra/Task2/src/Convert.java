import java.util.Scanner;
public class Convert {
    public static void main(String[] args){
        
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        long minutes=input.nextLong();

        double years = minutes / (60.0 * 24.0 * 365.0);
        int fullYears = (int) years; 

        long remainingMinutes = minutes - (fullYears * 60 * 24 * 365);

        int days = (int) (remainingMinutes / (60.0 * 24));

        System.out.println(minutes + " minutes is approximately " + fullYears + " years and " + days + " days.");
    }

}
