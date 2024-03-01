import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank_Account userAccount = new Bank_Account();
        ATM_machine atm = new ATM_machine(userAccount);

        while (true) {
            atm.displayOptions();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice (1-4): ");

            try {
                int choice = scanner.nextInt();
                atm.choices(choice);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

    }

}
