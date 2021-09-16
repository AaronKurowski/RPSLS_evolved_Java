package rpsls;

import java.util.Scanner;

public class Game {
    static int numberOfWinsToGameOver;
    Scanner gameInput;

    public void runGame() {

        // Human newPlayer = new Human();
        // newPlayer.chooseGesture();

        // Ai computer = new Ai();
        // System.out.println("Name of Ai: " + computer.name);

        // computer.chooseGesture();

        openingStatement();
        numberOfRounds();
        System.out.println(Game.numberOfWinsToGameOver);

    }

    public void battle() {

    }

    final static void printLine(String text) {
        System.out.println(text);
    }

    public void openingStatement() {
        printLine("\nWelcome to Rock, Paper, Scissors, Lizard, Spock");
        printLine("\nHere are the rules: ");
        printLine("\nRock crushes Scissors");
        printLine("Scissors cuts Paper");
        printLine("Paper covers Rock");
        printLine("Rock crushes Lizard");
        printLine("Lizard poisons Spock");
        printLine("Spock smashes Scissors");
        printLine("Scissors decapitates Lizard");
        printLine("Lizard eats Paper");
        printLine("Paper disproves Spock");
        printLine("Spock vaporizes Rock");

    }

    public void decideWinner() {

    }

    public int userChosenRoundNumber() {
        gameInput = new Scanner(System.in);
        printLine("\nChoose a number and you'll play a best of that number");
        String rounds = gameInput.nextLine();
        return Integer.parseInt(rounds);
    }

    public void numberOfRounds() {
        int num = userChosenRoundNumber();
        if(num % 2 == 0) {
            int winningNumber = (num / 2) + 1;
            Game.numberOfWinsToGameOver = winningNumber;
        }
        else if(num % 2 == 1) {
            int winningNumber = ((num + 1) / 2);
            Game.numberOfWinsToGameOver = winningNumber;
        }
    }
}
