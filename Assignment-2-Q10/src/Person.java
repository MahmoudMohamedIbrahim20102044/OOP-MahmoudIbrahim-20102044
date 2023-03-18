public class Person {
    private String name;
    private String address;
    private int phonenumber;
    private String email;

    public Person(String name, String address, int phonenumber, String email) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
    }
    public String toString(){
        return "Name is "+name+"\nAdress is "+address+"\nphonenumber is "+phonenumber+"\nEmail is "+email;
    }
}
