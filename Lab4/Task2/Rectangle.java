public class Rectangle {

    double length;
    double width;

    Rectangle(){
        this(10.0,10.0);
    }

    Rectangle(double length,double width){
        if(length>0 && width>0){
            this.length=length;
            this.width=width;
        }
        else{
            length=10.0;
            width=10.0;
        }

    }

    public double getArea(){
        if(length >=10 && length<=50 && width>=10 && width<=50){
            return width*length;
        }
        else{
            return -1;
        }

    }

    public double getPerimeter(){
        return (length+width)*2;
    }

    public void drawRect(){
        if(length >=10 && length<=50 && width>=10 && width<=50){
            for(int i=0;i<length;i++){
                for(int j=0;j<width;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        else{
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }

        }
    }
    
}
