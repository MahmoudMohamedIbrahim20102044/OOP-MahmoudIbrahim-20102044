public class Student extends Person{
    private String class_status ;
    public Student(String name, String address, int phonenumber, String email,String class_status){
        super(name,address,phonenumber,email);
        this.class_status=class_status;
    }
    public String toString(){
        return super.toString()+"\nClass status is "+class_status;
    }


}
