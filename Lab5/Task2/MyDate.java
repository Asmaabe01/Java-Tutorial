package Task2;
import java.util.GregorianCalendar;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(GregorianCalendar.YEAR);       
        this.month = calendar.get(GregorianCalendar.MONTH);        
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime) {        
        // Create a calendar object using the elapsed time
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);        
        this.year = calendar.get(GregorianCalendar.YEAR);        
        this.month = calendar.get(GregorianCalendar.MONTH);        
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);   
    }

    public MyDate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();        
        calendar.setTimeInMillis(elapsedTime);        
        this.year = calendar.get(GregorianCalendar.YEAR);        
        this.month = calendar.get(GregorianCalendar.MONTH);        
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
}
