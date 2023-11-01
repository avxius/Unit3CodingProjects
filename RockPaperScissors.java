import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter 0 for Rock, 1 for Paper, or 2 for Scissors:");
        int player = scan.nextInt();
        int computer = (int) (Math.random()*3);

        System.out.println("You chose " + player + ", and the computer chose " + computer + ".");
        if (player == computer) {
            System.out.println("It's a draw!");
        } else if ((player == 0 && computer == 2) || (player == 1 && computer == 0) || (player == 2 && computer == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}

