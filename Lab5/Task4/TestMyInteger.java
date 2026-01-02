package Task4;

public class TestMyInteger {
    public static void main(String[] args) {

        MyInteger n1 = new MyInteger(7);
        MyInteger n2 = new MyInteger(10);
        MyInteger n3 = new MyInteger(7);

        // getter
        System.out.println("n1 value: " + n1.getValue());

        // instance methods
        System.out.println("n1 isEven(): " + n1.isEven());
        System.out.println("n1 isOdd(): " + n1.isOdd());
        System.out.println("n1 isPrime(): " + n1.isPrime());

        // static int methods
        System.out.println("isEven(10): " + MyInteger.isEven(10));
        System.out.println("isOdd(10): " + MyInteger.isOdd(10));
        System.out.println("isPrime(10): " + MyInteger.isPrime(10));

        // static MyInteger methods
        System.out.println("isEven(n2): " + MyInteger.isEven(n2));
        System.out.println("isOdd(n2): " + MyInteger.isOdd(n2));
        System.out.println("isPrime(n2): " + MyInteger.isPrime(n2));

        // equals methods
        System.out.println("n1.equals(7): " + n1.equals(7));
        System.out.println("n1.equals(8): " + n1.equals(8));
        System.out.println("n1.equals(n3): " + n1.equals(n3));
        System.out.println("n1.equals(n2): " + n1.equals(n2));

        // parseInt(char[])
        char[] arr = {'1', '2', '3'};
        System.out.println("parseInt(char[]{'1','2','3'}): " + MyInteger.parseInt(arr));

        // parseInt(String)
        System.out.println("parseInt(\"456\"): " + MyInteger.parseInt("456"));
    }
}

