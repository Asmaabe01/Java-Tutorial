package Task4;

public class MyInteger {

    private int value;

    public MyInteger(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }

    public boolean isEven(){
        return value%2 == 0;

    }
    
    public boolean isOdd(){
        return value%2 != 0;

    }

    public boolean isPrime(){
        return isPrime (this.value);

    }

    public boolean equals(int other) {
        return this.value == other;
    }

    public boolean equals(MyInteger other) {
        return this.value == other.value;
    }

    public static boolean isEven(int v){
        return v %2 == 0;

    }
    
    public static boolean isOdd (int v){
        return v %2 != 0;

    }

    public static boolean isPrime(int v){
        if (v <= 1) return false;

        for (int i = 2; i <= Math.sqrt(v); i++) {
            if (v % i == 0)
                return false;
        }
        return true;

    }

    public static boolean isEven(MyInteger myInt){
        return myInt.value%2 == 0;

    }
    
    public static boolean isOdd(MyInteger myInt){
        return myInt.value%2 != 0;

    }

    public static boolean isPrime(MyInteger myInt){
        return isPrime (myInt.value);

    }

    public static int parseInt(char[] chars) {
        int result = 0;

        for (char c : chars) {
            // convert digit char to number: '0'->0, '1'->1 ...
            int digit = c - '0';
            result = result * 10 + digit;
        }
        return result;
    }

    // converts String like "456" -> 456
    public static int parseInt(String s) {
        return parseInt(s.toCharArray()); // reuse char[] version
    }
}



