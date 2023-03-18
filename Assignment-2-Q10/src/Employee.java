public class Employee extends Person{
    private String office;
    private double salary;
    private String datehired;
    public Employee(String name, String address, int phonenumber, String email,String office,double salary,String datehired){
        super(name,address,phonenumber,email);
        this.office=office;
        this.salary=salary;
        this.datehired=datehired;
    }
    public String toString(){
        return super.toString()+"\nThe office name is "+office+"\nThe salary is "+salary+"\nThe date hired is "+datehired;
    }
}
