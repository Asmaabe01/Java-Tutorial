import java.util.Scanner;
public class Convertor {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.print("Please input a Character: ");
        char ch = input.next().charAt(0);

        if (Character.isLetter(ch)) {
            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
            }
            else{
                ch=Character.toLowerCase(ch);
            } 
           System.out.println("Converted character: " + ch); 
        } else {
            System.out.println("Wrong input!");  
        }
        input.close();

    }

    
}