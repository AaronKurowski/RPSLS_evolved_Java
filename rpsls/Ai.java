package rpsls;

public class Ai extends Player {
    Math math;

    public Ai() {
        this.name = "Computer";
    }

    public void chooseGesture() {
        int randomNummber = (int)(Math.random() * 6);
        this.chosenGesture = Ai.gestures[randomNummber];
        System.out.println(this.chosenGesture);
    }

}
