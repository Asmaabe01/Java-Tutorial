import java.util.Scanner;

public class CozaLozaWozaNew{
    public static void main (String[] args) {

        Scanner input= new Scanner(System.in);
        
        System.out.println("Please input the range of the number: ");
        System.out.print("from (>0): ");
        int start=input.nextInt();
        System.out.print("To: ");
        int end=input.nextInt();

        printNum(start,end);   

    }


public static void printNum(int startNum, int endNum){
    System.out.println("The output of CozaLozaWoza is: ");
    int count=0;
    for(int num=startNum ; num<=endNum ; num++){
            if(num%3==0 && num%5==0){
                System.out.print("CozaLoza"+" ");
            }
            else if(num%3==0){
                System.out.print("Coza"+" ");
            }
            else if(num%5==0){
                System.out.print("Loza"+" ");
            }
            else if(num%7==0){
                System.out.print("Woza"+" ");
            }
           
            else {
                System.out.print(num+" ");
            }
        count++;

    if (num % 11 == 0) {
        System.out.println();
        count=0;
    }
}
}
}