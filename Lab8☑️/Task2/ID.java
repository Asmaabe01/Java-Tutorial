import java.util.Scanner;
public class ID{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an ID: ");
        String id=input.nextLine();

        String idFormat="\\d{4}-\\d{4}-\\d{3}";

        if(id.matches(idFormat)){
            System.out.println(id+ " is a valid student ID.");
        }
        else{
            System.out.println(id+ " is not a valid student ID.");
        }



        

    }
}