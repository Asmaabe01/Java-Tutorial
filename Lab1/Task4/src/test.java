import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        System.out.println("Is " + num + " divisible by 5 and 6? " + isDivisibleByBoth(num));
        System.out.println("Is " + num + " divisible by 5 or 6? " + isDivisibleBy5Or6(num));
        System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + isDivisibleBy5Or6ButNotBoth(num));
    }

    public static boolean isDivisibleByBoth(int num) {
        return (num % 5 == 0 && num % 6 == 0);
    }

    public static boolean isDivisibleBy5Or6(int num) {
        return (num % 5 == 0 || num % 6 == 0);
    }

    public static boolean isDivisibleBy5Or6ButNotBoth(int num) {
        return (num % 5 == 0 || num % 6 == 0) && !(num % 5 == 0 && num % 6 == 0);
    }
}
