import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account x=new Account(1122,20000,4.5);
        x.Withdraw(2500);
        x.Deposit(3000);
        System.out.println(x.getBalance());
        System.out.println(x.getMonthlyInterest());
        System.out.println(x.getDatecreated());
    }
}