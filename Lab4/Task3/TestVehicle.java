public class TestVehicle{
public static void main(String[] args){
    Vehicle v=new Vehicle(0,100,50,120,"TOYOTA");
    v.move();
    v.setSpeed(15);
    v.speedup();
    v.speedDown();
    int sp=v.getSpeed();
    System.out.println("The speed after speedup and speedDown is: "+ sp+ "km/h"+
                        "and the size of the vehicle is: "+ v.height+" , "+ v.length+" , "+ v.width+
                        " from the brand " + v.brand);

}
}
