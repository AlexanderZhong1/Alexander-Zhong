import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // seeing if the game is still running

        boolean gameRunning = true;

        // runs the game
        while (gameRunning == true) {

            int playerScore = 0;
            int computerScore = 0;

            // creates the obj for user to input
            Scanner userInput = new Scanner(System.in);

            System.out.println("Welcome to Rock Paper Scissors");
            System.out.println("Please input everything in lowercase");
            System.out.println("Play up to 15 \n");

            // checks if the player or computer won the game and if not, continues the loop
            while ((playerScore <= 15) || computerScore <= 15) {

                // every round shows score
                System.out.println("Score");
                System.out.println("You: " + playerScore + " Opponent: " + computerScore);
                System.out.println("Scissors/Paper/Rock");
                System.out.println("Enter your choice below ");

                // sees what the user chooses
                String userChoice  = userInput.nextLine();




            };
        };

    }
}
