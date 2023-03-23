public abstract class GeometricObject {
    public GeometricObject(){}
    protected boolean isFilled;
    protected String color;
    public GeometricObject(boolean isFilled,String color){
        this.color=color;
        this.isFilled=isFilled;
    }
    public void setColor(String color){
        this.color=color;
    }

    //public abstract boolean isFilled ();
    public abstract double getArea();
    public abstract double getPerimeter();

}
