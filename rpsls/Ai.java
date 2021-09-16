package rpsls;

public class Ai extends Player {
    Math math;

    public Ai() {
        this.name = "Computer";
    }

    public void chooseGesture() {
        int randomNumber = (int)(Math.random() * 5);
        this.chosenGesture = Ai.gestures[randomNumber].toLowerCase();
    }
}
