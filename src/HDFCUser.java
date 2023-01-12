import java.util.Random;
import java.util.UUID;

public class HDFCUser {
    private String userName;
    private String accountNo;
    private double accountBalance;
    private String password;
    private final double rateOfInterest = 7.5;

    static Random random = new Random();
    static long acNo = random.nextInt(999999999);


    public HDFCUser(String userName, double accountBalance, String password) {
        this.userName = userName;
        this.accountBalance = accountBalance;
        this.password = password;
    }

    public static void main(String[] args) {
        System.out.println(acNo);
    }






}
