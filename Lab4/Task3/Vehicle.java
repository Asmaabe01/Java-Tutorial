public class Vehicle {
    int speed;
    double length,width,height;
    String brand;

    public Vehicle(int s,double l,double w,double h,String brd){
        speed=s;
        length=l;
        width=w;
        height=h;
        brand=brd;
    }
    public void move(){
        System.out.println("The vehicle is running with speed "+ speed+ " km/h");
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void speedup(){
        speed+=5;
    }
    public void speedDown(){
        speed-=5;
    }
    public int getSpeed(){
        return speed;
    }





}