import java.util.Scanner;

public class ATM_machine {
    private Bank_Account userAccount;

    public ATM_machine(Bank_Account userAccount) {
        this.userAccount = userAccount;
    }

    public void displayOptions() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void choices(int choice) {
        Scanner scanner = new Scanner(System.in);
        double amount;

        switch (choice) {
            case 1:
                System.out.print("Enter withdrawal amount: R");
                amount = scanner.nextDouble();
                userAccount.withdrawing(amount);
                break;
            case 2:
                System.out.print("Enter deposit amount: R");
                amount = scanner.nextDouble();
                userAccount.depositing(amount);
                break;
            case 3:
                userAccount.checking_balance();
                break;
            case 4:
                System.out.println("Exiting. Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }

}
