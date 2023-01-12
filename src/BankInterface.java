public interface BankInterface {
    double checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int money, String password);
    double calculateInterest(int years);


}
