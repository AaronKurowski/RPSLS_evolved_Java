package rpsls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gesture {

    Map<String, List<String>> winConditions = new HashMap();

    public Gesture() {
        List<String> rockValues = new ArrayList<String>();
        rockValues.add("scissors");
        rockValues.add("lizard");
        winConditions.put("rock", rockValues);

        List<String> paperValues = new ArrayList<String>();
        paperValues.add("rock");
        paperValues.add("spock");
        winConditions.put("paper", paperValues);

        List<String> scissorValues = new ArrayList<String>();
        scissorValues.add("paper");
        scissorValues.add("lizard");
        winConditions.put("scissors", scissorValues);

        List<String> lizardValues = new ArrayList<String>();
        lizardValues.add("paper");
        lizardValues.add("spock");
        winConditions.put("lizard", lizardValues);

        List<String> spockValues = new ArrayList<String>();
        spockValues.add("rock");
        spockValues.add("scissors");
        winConditions.put("spock", spockValues);
    }

    public void printWinConditions() {
        System.out.println(winConditions);
    }

    public void defineWinnerForComputerOpponent(Human player1, Ai Computer) {
        for(var entry : winConditions.entrySet()) {
            

            // System.out.println(entry.getKey() + "/" + entry.getValue().get(0));
        }
    }
}
