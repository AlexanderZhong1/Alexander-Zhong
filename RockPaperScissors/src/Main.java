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

                // Scissors == 1 and Paper == 2 and Rock == 3

                // sees what the user chooses
                String userChoice  = userInput.nextLine();

                int userChoiceNum = 1;

                // turns user choice to number
                if (userChoice == "scissors") {
                    userChoiceNum = 1;
                }
                else if (userChoice == "paper") {
                    userChoiceNum = 2;
                }
                else if (userChoice == "rock") {
                    userChoiceNum = 3;
                };

                // random num generator to general computer's choice
                int computerNum = (int)(Math.random() * 3) + 1;
                // Scissors == 1 and Paper == 2 and Rock == 3

                String playerWin;

                // checks if pc wins or player

                if ((computerNum == 1 && userChoiceNum == 2) || (computerNum == 3 && userChoiceNum == 1) || (computerNum == 2 && userChoiceNum == 3)) {
                    playerWin = "lost";
                }
                else if (computerNum == userChoiceNum) {
                    playerWin = "tie";
                }
                else {
                    playerWin = "win";
                }





            };
        };

    }
}
