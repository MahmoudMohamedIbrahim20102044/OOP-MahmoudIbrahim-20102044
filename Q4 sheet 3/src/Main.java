public class Main {
    public static void main(String[] args) {

        Triangle t=new Triangle(true,"Blue",5,3,4);
        System.out.println(t.getArea()+"  "+t.getPerimeter()+"  "+t.color+"  "+t.isFilled);
    }

}