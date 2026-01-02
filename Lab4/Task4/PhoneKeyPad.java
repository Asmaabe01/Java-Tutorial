import java.util.Scanner;

public class PhoneKeyPad{
        public static void main (String[] args){

            Scanner input=new Scanner(System.in);
            System.out.print("please input a String: ");
            String word=input.next().toLowerCase();

            StringBuilder result=new StringBuilder();


            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);

                switch(ch){
                     case 'a':
                case 'b':
                case 'c':
                    result.append("2");
                    break;
                case 'd':
                case 'e':
                case 'f':
                    result.append("3");
                    break;
                case 'g':
                case 'h':
                case 'i':
                    result.append("4");
                    break;
                case 'j':
                case 'k':
                case 'l':
                    result.append("5");
                    break;
                case 'm':
                case 'n':
                case 'o':
                    result.append("6");
                    break;case 'p':
                case 'q':
                case 'r':
                case 's':
                    result.append("7");
                    break;
                case 't':
                case 'u':
                case 'v':
                    result.append("8");
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    result.append("9");
                    break;
                default:
                     result.append("");
                    break;
                }
            }

            System.out.println("The corresponding digit sequence is: "+ result.toString());

            input.close();


    }
}