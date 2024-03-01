public class Bank_Account {

    private double balance;

    public void withdrawing(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrew R" + amount + ". New balance: R" + balance);
        }
        else {
            System.out.println("Insufficient Funds");
        }

    }
    public void depositing(double amount) {
        balance = balance + amount;
        System.out.println("Deposited R" + amount + ". New balance: R" + balance);
    }
    public void checking_balance() {
        System.out.println("Current balance: R" + balance);
    }

}
