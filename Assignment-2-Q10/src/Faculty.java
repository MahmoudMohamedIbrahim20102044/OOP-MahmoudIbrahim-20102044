public class Faculty extends Employee{
    private String officehour;
    private String rank;
    public Faculty(String name, String address, int phonenumber, String email,String office,double salary,String datehired,String officehour,String rank){
        super(name,address,phonenumber,email,office,salary,datehired);
        this.officehour=officehour;
        this.rank=rank;
    }
    public String toString(){
        return super.toString()+"\nOffice hour is "+officehour+"\nRank is "+rank;
    }
}
