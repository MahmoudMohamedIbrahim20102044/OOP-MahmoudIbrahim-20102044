public class Staff extends Employee{
    private String title;
    public Staff(String name, String address, int phonenumber, String email,String office,double salary,String datehired,String title){
        super(name,address,phonenumber,email,office,salary,datehired);
        this.title=title;
    }
    public String toString(){
        return super.toString()+"\n The title is "+title;
    }

}
