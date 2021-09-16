package rpsls;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Player {
    String name;
    String chosenGesture;
    int winCount;
    static String[] gestures = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
    static Scanner userInput;
    
    public Player() {
        userInput = new Scanner(System.in);
    }
    
    protected String chooseName() {

        while(true) {
            try {
                System.out.print("Choose your name: ");
                String userName = userInput.next();
                if(userName.length() > 12 || userName.length() < 2) {
                    printToConsole("User's name must be greater than 2 characters and less than 12");
                    continue;
                }
                else {
                    printToConsole("Hello " + userName + "!");
                    return userName;
                }
            } catch(Exception e) {
                printToConsole("Error getting user's name: " + e.getLocalizedMessage());
            }
        }
    }

    protected void chooseGesture() {
        String gestureChoice;
        try {
            String joinedGesture = String.join(" || ", Player.gestures);
            while(true) {
                System.out.print(joinedGesture + "\nChoose a gesture >>>");
                userInput.nextLine();
                gestureChoice = userInput.next();
                if(Arrays.asList(Player.gestures).contains(toTitleCase(gestureChoice))) {
                    this.chosenGesture = gestureChoice;
                    break;
                } 
                else if(gestureChoice == null) {
                    continue;
                } else {
                    continue;
                }
            }

        } catch(Exception e) {
            printToConsole("Error choosing gesture: " + e.getLocalizedMessage());
        }
    }

    public static String toTitleCase(String s) {
        return (s.length() > 0) ? s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() : "";
    }

    public static void printToConsole(String text) {
        System.out.println(text);
    }
}
