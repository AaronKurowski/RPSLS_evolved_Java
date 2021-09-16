package rpsls;

public class Game {
    // TODO: Create constructor to initilize players upon instantiation

    // TODO: Welcome method. Explain the rules

    // TODO: Battle, decide winner methods

    public void runGame() {

        Human newPlayer = new Human();
        newPlayer.chooseGesture();

        Ai computer = new Ai();
        System.out.println("Name of Ai: " + computer.name);

        computer.chooseGesture();

    }
}
