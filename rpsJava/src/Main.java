import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] choices = {"Rock", "Paper", "Scissors"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your choice (Rock, Paper, or Scissors):");
        String user = scanner.nextLine().toLowerCase(); 

        int index = random.nextInt(3);
        String computer = choices[index];

        System.out.println("Computer's choice: " + computer);

        if (user.equals(computer)) { 
            System.out.println("It's a tie!");
        } else if (user.equals("rock") && computer.equals("scissors")) {
            System.out.println("You win!");
        } else if (user.equals("paper") && computer.equals("rock")) {
            System.out.println("You win!");
        } else if (user.equals("scissors") && computer.equals("paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
