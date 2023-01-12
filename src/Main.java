import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter balance : ");
        double amount = sc.nextDouble();
        System.out.print("Enter Password : ");
        String password = sc.next();


        SBIUser user = new SBIUser(name, amount, password);
        System.out.println("Your balance is : "+user.checkBalance());


        System.out.print("Enter more amount you want to add : ");
        int addMoney = sc.nextInt();
        String message = user.addMoney(addMoney);
        System.out.println("You have added successfully : "+addMoney);
        System.out.println(message);


        System.out.print("Enter amount you want to withdraw : ");
        int withdrawalAmount = sc.nextInt();
        System.out.print("Enter your password : ");
        String pwd = sc.next();
        System.out.println(user.withdrawMoney(withdrawalAmount, pwd));


        System.out.println(user.calculateInterest(24));
    }
}