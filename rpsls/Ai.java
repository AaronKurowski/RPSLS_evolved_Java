package rpsls;

import java.util.Random;

public class Ai extends Player {
    // TODO: inherit from player class, add randomness, overload certain methods
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
