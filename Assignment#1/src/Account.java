import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualinterestrate;
    private Date datecreated;
    public Account(){

    }
    public Account(int id , double balance,double annualinterestrate){
        this.id=id;
        this.balance=balance;
        Account.annualinterestrate=annualinterestrate;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public static double getAnnualinterestrate(){
        return annualinterestrate;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

    public static void setAnnualinterestrate(double annualinterestrate) {
        Account.annualinterestrate=annualinterestrate/100;
    }
    public Date getDatecreated(){
         Date x=new Date();
         return x;
    }
    public double getMonthlyInterestRate(){
        return annualinterestrate/12;
    }
    public double getMonthlyInterest(){
        return (balance* getMonthlyInterestRate());
    }
    public void Withdraw(double amount){
        balance=balance-amount;
    }
    public void Deposit(double amount){
        balance=balance+amount;
    }

}

