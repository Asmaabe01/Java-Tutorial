package Task4;

import java.util.Arrays;

public class TestArrayMethods {
    public static void main(String[] args){

        ArrayMethods am = new ArrayMethods();
        char[] array1 = {'s','t','r','e','s','s'};
        char[] array2= new char[array1.length]; 
        boolean ok;

        int elementsCopied= am.duplicate(array1, array2);
        ok=am.same(array1,array2);

        System.out.println("Array1: "+Arrays.toString(array1));
        System.out.println("Array2: "+Arrays.toString(array2));
        System.out.println("Number of elements copied: " + elementsCopied);
        System.out.println("Are the arrays the same? " + ok);



    }
    
}
