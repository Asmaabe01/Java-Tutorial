package Task3;

public class Circle2D {

    private double x;
    private double y;
    private double radius;

    public Circle2D(){
        this(0,0,1);
    }

    public Circle2D (double x, double y, double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public boolean contains (double x, double y){
        // Returns true if the point (x, y) is inside or on the boundary of this circle.
        double d = Math.hypot(this.x - x, this.y - y);
        return d <= this.radius;
    }

    public boolean contains(Circle2D circle){
        double d = Math.hypot(this.x - circle.x, this.y - circle.y);
        // other circle fully inside this circle
        return d + circle.radius <= this.radius;
    }

    public boolean overlaps(Circle2D circle){
        double d = Math.hypot(this.x - circle.x, this.y - circle.y);
        // overlap means they intersect (share some area) but neither fully contains the other
        return d < (this.radius + circle.radius) && d > Math.abs(this.radius - circle.radius);

    }



    
}
