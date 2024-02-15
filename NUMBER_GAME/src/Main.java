import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int generate_random_number()
    {
        Random random = new Random();

        int random_number = random.nextInt(10); // Generating a random number as integer
        System.out.println(random_number);
        return random_number;
    };

    public static void main(String[] args) {

        int lives = 3;
        int round = 1;
        Scanner scanner = new Scanner(System.in);

        int random_number = generate_random_number();

        while (true)
        {
            System.out.println("Round: " + round);
            System.out.println("Guess the number generated");
            String guessed_string = scanner.nextLine(); // Getting the users input as string
            int guessed_number = Integer.parseInt(guessed_string);

            if (Objects.equals(guessed_number, random_number)) {
                System.out.println("You WON!!!");
                round = round + 1;
                random_number = generate_random_number();
                lives = 3;
            }
            else if (lives == 1) {
                System.out.println("You LOST!!!");
                break;
            }
            else if (guessed_number < random_number) {
                System.out.println("Too low");
                lives = lives-1;
                System.out.println("Lives left: " + lives);
            }
            else if (guessed_number > random_number) {
                System.out.println("Too high");
                lives = lives-1;
                System.out.println("Lives left: " + lives);
            }

        }


    }

}