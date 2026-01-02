package Task4;

public class TestPerson {
    public static void main(String[] args) {

        Person p=new Person("Asmaa");
        try{
            p.setAge(20);
            System.out.println("The age is: "+ p.getAge());

        }catch(MinusAgeException e){
            System.out.println("Exception caugth: "+ e.getMessage());
            //return the message stored before
        }

    }
}
