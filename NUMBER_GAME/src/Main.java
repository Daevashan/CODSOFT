import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number generated");
        String guessed_number = scanner.nextLine();

        int random_number = random.nextInt(101);
        System.out.println(random_number);
    }

}