package rpsls;

import java.util.Scanner;

public class Game {
    static int numberOfWinsToGameOver;
    Scanner gameInput;
    Human player1;
    Human player2;
    Ai computer;
    Gesture gesture;

    public Game() {
        chooseContestants();
        gesture = new Gesture();
    }

    public void runGame() {
        openingStatement();
        numberOfRounds();
        battle();
        declareWinner();
    }

    public void chooseContestants() {
        gameInput = new Scanner(System.in);
        printLine("\nType 1 to play against a computer ai");
        printLine("Type 2 to play against another human");
        String userChoice = gameInput.next();
        if(userChoice.equals("1")) {
            player1 = new Human();
            computer = new Ai();
        }
        else {
            player1 = new Human();
            player2 = new Human();
        }
    }

    public void battle() {
        if(player2 == null) {
            while(player1.winCount < numberOfWinsToGameOver && computer.winCount < numberOfWinsToGameOver) {
                player1.chooseGesture();
                computer.chooseGesture();
                gesture.defineWinnerForComputerOpponent(player1, computer);
            }
        }
        else {
            while(player1.winCount < numberOfWinsToGameOver && player2.winCount < numberOfWinsToGameOver) {
                printLine("This is 2 humans battling");
                break;
            }
        }
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

    public int userChosenRoundNumber() {
        gameInput = new Scanner(System.in);
        printLine("\nChoose a best of round number");
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
        System.out.println("First to " + Game.numberOfWinsToGameOver + " wins.");
    }

    public void declareWinner() {
        if(player1.winCount > computer.winCount) {
            printLine("Player 1 wins the game!");
        }
        else {
            printLine("Computer wins the game!");
        }
    }

    public void printGameData() {
        printLine("Number of wins to game over: " + numberOfWinsToGameOver);
        printLine("Player 1 win count: " + player1.winCount);
        printLine("Computer win count: " + computer.winCount);
    }
}

