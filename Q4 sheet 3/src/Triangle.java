public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(){}
    public Triangle(boolean isFilled,String color,double side1,double side2,double side3){
        super(isFilled,color);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    @Override
    public double getArea() {
        return Math.sqrt((getPerimeter()/2)*(getPerimeter()/2-side1)*(getPerimeter()/2-side2)*(getPerimeter()/2-side3));
    }

    @Override
    public double getPerimeter() {
        return side1+side3+side2;
    }
}
