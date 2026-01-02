package Task4;

public class Person {

    private String name;
    private int age;

    public Person(String name){
        this.name=name;
    }

    //this method might throw an exception
    public void setAge(int age) throws MinusAgeException{
        if(age<0){
            throw new MinusAgeException("Age must be positive!");
            //this message will be stored by super
        }
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    
}
