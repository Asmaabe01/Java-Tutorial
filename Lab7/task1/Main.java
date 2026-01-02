class Main{
    public static void main(String[] args){

        double radius =3.5;

        MyCircle c=new MyCircle();
        MySphere s=new MySphere();

        System.out.println("Circle:");
        System.out.println("Area = " + c.Area(radius));
        System.out.println("Volume = " + c.volume(radius));

        System.out.println("\nSphere:");
        System.out.println("Area = " + s.Area(radius));
        System.out.println("Volume = " + s.volume(radius));
    }
}