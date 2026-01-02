package Task2;

public class TestMyDate {
    public static void main(String[] args){

    MyDate d1=new MyDate();
    MyDate d2=new MyDate(34355555133101L);

    System.out.println("Date1: "+ d1.getDay()+" / "+(d1.getMonth()+1)+" /"+d1.getYear());
    System.out.println("Date2: "+ d2.getDay()+" / "+(d2.getMonth()+1)+" /"+d2.getYear());

    }
    
}
