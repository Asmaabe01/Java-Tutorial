public class MySphere implements VolumeArea{

    @Override
    public double volume(double radius){
        return (4*PI*radius*radius*radius)/3;
    }

    @Override
    public double Area(double radius){
        return 4*PI*radius*radius;
    }
}