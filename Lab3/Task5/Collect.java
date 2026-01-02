import java.util.Scanner;
public class Collect{

    public static int[] collectUnique (int[] raw){
        int count = 0;
        for (int i = 0; i < raw.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (raw[i] == raw[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < raw.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (raw[i] == raw[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result[index++] = raw[i];
            }
        }

        return result; 
    }



    

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] raw = new int[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < raw.length; i++) {
            raw[i] = input.nextInt();
        }

        int[] uniqueNumbers = collectUnique(raw);

        System.out.println("The number of distinct numbers is " + uniqueNumbers.length);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < uniqueNumbers.length; i++) {
            System.out.print(uniqueNumbers[i] + " ");
        }

        input.close();
    }
}