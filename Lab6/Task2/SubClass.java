package Task2;

public class SubClass extends BaseClass {

    int yVar=16;
    String strVar="Java program!!";

    @Override

    public void myPrint(){
        super.myPrint();
        System.out.println("Y= "+ yVar);
        System.out.println("String: "+ strVar);

    }

    public void printAll() { 
        myPrint(); 
    }
}
