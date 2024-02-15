import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static int generate_random_number()
    {
        Random random = new Random();

        int random_number = random.nextInt(100); // Generating a random number as integer
        return random_number;
    };

    public static void main(String[] args) {

        int lives = 9;
        int round = 1;
        Scanner scanner = new Scanner(System.in);

        int random_number = generate_random_number();

        while (true)
        {
            int Guessed_number = Integer.parseInt(JOptionPane.showInputDialog("Round: " + round + "\n\nGuess the number generated"));

            if (Objects.equals(Guessed_number, random_number)) {
                JOptionPane.showMessageDialog(null,"You WON! \n Your score: " + round * 10);
                round = round + 1;
                random_number = generate_random_number();
                lives = 3;

            } else if (lives == 1) {
                JOptionPane.showMessageDialog(null,"You LOST!");
                break;
            }
            else if (Guessed_number < random_number) {
                lives = lives-1;
                JOptionPane.showMessageDialog(null,"Too low \n Lives left: " + lives);
            }
            else if (Guessed_number > random_number) {
                lives = lives-1;
                JOptionPane.showMessageDialog(null,"Too high \n Lives left: " + lives);
            }
            else {
                System.out.println(111);
            }

        }


    }

}