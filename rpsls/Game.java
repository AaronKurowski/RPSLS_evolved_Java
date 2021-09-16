package rpsls;

public class Game {
    static int numberOfRounds;

    // TODO: Create constructor to initilize players upon instantiation

    // TODO: Welcome method. Explain the rules

    // TODO: Battle, decide winner methods

    public void runGame() {

        // Human newPlayer = new Human();
        // newPlayer.chooseGesture();

        // Ai computer = new Ai();
        // System.out.println("Name of Ai: " + computer.name);

        // computer.chooseGesture();

        openingStatement();

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

    public int numberOfRounds(int rounds) {
        return rounds;
    }


}
