package Task4;

public class ArrayMethods {

    public int duplicate (char[] array1, char[] array2){

        if (array2.length < array1.length) { 
            throw new IllegalArgumentException("array2 must be of the same or greater length as array1.");
        }

        int copy=0;

        for(int i=0; i< array1.length;i++){
                array2[i]=array1[i];
                copy++;
        }

        return copy;

    }

    public boolean same(char[] array1, char[] array2){

        if (array1.length != array2.length) {
            return false;
        }

        for(int i=0;i<array1.length;i++){
            if(array1[i]!=array2[i]){
                return false;
            }
        }
        return true;
            
    }
}

