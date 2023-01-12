import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class SBIUser implements BankInterface{
//    Attributes :
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private static double rateOfInterest;

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBIUser.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance+amount;
        return "Money added successfully & your total balance is : "+balance;
    }

    @Override
    public String withdrawMoney(int money, String enteredPassword) {
        if(Objects.equals(enteredPassword, password)){
            if(money>balance){
                return "Insufficient Balance !";
            }else{
               balance = balance-money;
               return "Enjoy, you have withdrawn "+money+"\nRemaining Balance "+balance;
            }
        }else{
            return "Wrong Password !";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return balance*rateOfInterest*(years/100);
    }
}
