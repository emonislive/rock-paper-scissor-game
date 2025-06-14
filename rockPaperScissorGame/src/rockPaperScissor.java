import java.util.Scanner;
import java.util.Random;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissor"};
        String userChoice, computerChoice;
        String programRunnung = "yes";

        do{
            System.out.println("***************************");
            System.out.println(" Rock-Paper-Scissor Game");
            System.out.println("***************************\n");

            System.out.print("Enter your Choice (rock, paper, scissor): ");
            userChoice = scanner.next().toLowerCase();
            computerChoice = choices[random.nextInt(3)];

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissor")) {
                System.out.println("Invalid Input. Try writing (rock, paper, scissor)");
                continue;
            }

            System.out.println("Computer Choice: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie.");
            }
            else if ((userChoice.equals("rock") && computerChoice.equals("scissor")) || (userChoice.equals("paper") && computerChoice.equals("rock")) || (userChoice.equals("scissor") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            }
            else {
                System.out.println("You lose!! :( ");
            }

            System.out.println("Do you want to play again? (yes, no): ");
            programRunnung = scanner.next();

            while (!programRunnung.equals("yes") && !programRunnung.equals("no")) {
                System.out.println("Wrong Input. Try again\n");
                System.out.println("Do you want to play again? (yes, no): ");
                programRunnung = scanner.next();
            }
        } while(programRunnung.equals("yes"));

        scanner.close();
    }
}
