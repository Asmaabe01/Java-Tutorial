public class TestStudent{
    public static void main(String[] args){

        Student s1=new Student("Asmaa",20);
        Student s2=new Student("Ilham",20);

        System.out.println(s1.getName()+" is "+ s1.getAge()+" years old");
        System.out.println(s2.getName()+" is "+ s2.getAge()+" years old");

        if(s1.isSameAge(s2)){
            System.out.println("they have the same age!");
        }else{
            System.out.println("they don't have the same age!");
        }
        

    }
}