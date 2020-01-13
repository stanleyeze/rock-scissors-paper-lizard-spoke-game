package rockscissorspapergame;

import java.util.ArrayList;

public class Computers {

    private int consecutiveWins = 0;
    private String lastWinner = "";
    private int numberOfconsecutiveWins = 2;
    private String results = "";
    ArrayList<String[]> resultArray = new ArrayList<>();

    //set's consecutive wins
    public int getConsecutiveWins() {
        return consecutiveWins;
    }

    //set's consecutive wins
    public void setConsecutiveWins() {
        consecutiveWins = consecutiveWins + 1;
    }

    //reset the number of consecutive wins
    public void resetConsecutiveWins() {
        consecutiveWins = 0;
    }

    //set's results in a list format
    public void setResults(String str) {
        results += "<li>" + str + "<li>";
    }

    //resets result to an empty string
    public void reSetResults() {
        results = "";
    }

    //resets result to an empty string
    public void reSetArraylistResults() {
        resultArray.clear();
    }

    //get's the last winner
    public String getLastWinner() {
        return lastWinner;
    }

    //set's the last winner
    public void setLastWinner(String lw) {
        lastWinner = lw;
    }

    public void setNumberOfconsecutiveWins(int number) { // set the number of consecutive wins required to win a match
        numberOfconsecutiveWins = number;
    }

    public int getNumberOfconsecutiveWins() {// get the number of consecutive wins to win a match
        return numberOfconsecutiveWins;
    }

    public void playRound(String playerOneSelection, String playerTwoSelection) { // handles the result of each stage
        //conditional statements to select choice

        if (result(playerOneSelection, playerTwoSelection).equalsIgnoreCase(playerOneSelection)) { // check if player B won

            if (getLastWinner().equalsIgnoreCase("")) {
                setLastWinner("A");
                setConsecutiveWins();
                //adds results to the arraylist
                resultArray.add(handleResults("A", playerOneSelection, "B", playerTwoSelection, "A Won!"));
            } else if (getLastWinner().equalsIgnoreCase("A")) {
                // System.out.println("A Play1 "+playerOneSelection+" "+" Player2 "+playerTwoSelection+" winner "+playerOneSelection);
                setConsecutiveWins();
                //adds results to the arraylist
                resultArray.add(handleResults("A", playerOneSelection, "B", playerTwoSelection, "A Won!"));
            } else if (getLastWinner().equalsIgnoreCase("B")) {
                //System.out.println("B Play1"+playerOneSelection+" "+" Player2 "+playerTwoSelection+" winner "+playerOneSelection);
                resetConsecutiveWins();
                reSetResults();
                reSetArraylistResults();
                setLastWinner("A");
                setConsecutiveWins();
                //adds results to the arraylist
                resultArray.add(handleResults("A", playerOneSelection, "B", playerTwoSelection, "A Won!"));
            }

        } else if (result(playerOneSelection, playerTwoSelection).equalsIgnoreCase(playerTwoSelection)) {// check if player B won
            if (getLastWinner().equalsIgnoreCase("")) {
                setLastWinner("B");
                setConsecutiveWins();
                //adds results to the arraylist
                resultArray.add(handleResults("A", playerOneSelection, "B", playerTwoSelection, "B Won!"));
            } else if (getLastWinner().equalsIgnoreCase("B")) {
                setConsecutiveWins();
                //adds results to the arraylist
                resultArray.add(handleResults("A", playerOneSelection, "B", playerTwoSelection, "B Won!"));
            } else if (getLastWinner().equalsIgnoreCase("A")) {
                resetConsecutiveWins();
                reSetArraylistResults();
                setLastWinner("B");
                setConsecutiveWins();
                //adds results to the arraylist
                resultArray.add(handleResults("A", playerOneSelection, "B", playerTwoSelection, "B Won!"));
            }
        } else if (result(playerOneSelection, playerTwoSelection).equalsIgnoreCase("draw")) {
            //System.out.println("draw here");
        }

    }

    private String result(String playerOneSelection, String playerTwoSelection) {// returns the winner of each round
        String wins = "";
        // conditional if statements for returning the winner
        if (playerOneSelection.equalsIgnoreCase("paper") && playerTwoSelection.equalsIgnoreCase("scissors")) {
            wins = playerTwoSelection;
        } else if (playerOneSelection.equalsIgnoreCase("scissors") && playerTwoSelection.equalsIgnoreCase("paper")) {
            wins = playerOneSelection;
        } else if (playerOneSelection.equalsIgnoreCase("paper") && playerTwoSelection.equalsIgnoreCase("rock")) {
            wins = playerOneSelection;
        } else if (playerOneSelection.equalsIgnoreCase("rock") && playerTwoSelection.equalsIgnoreCase("paper")) {
            wins = playerTwoSelection;
        } else if (playerOneSelection.equalsIgnoreCase("rock") && playerTwoSelection.equalsIgnoreCase("scissors")) {
            wins = playerOneSelection;
        } else if (playerOneSelection.equalsIgnoreCase("scissors") && playerTwoSelection.equalsIgnoreCase("rock")) {
            wins = playerTwoSelection;
        } else if (playerOneSelection.equalsIgnoreCase("rock") && playerTwoSelection.equalsIgnoreCase("Lizard")) {
            wins = playerOneSelection;
        } else if (playerOneSelection.equalsIgnoreCase("lizard") && playerTwoSelection.equalsIgnoreCase("rock")) {
            wins = playerTwoSelection;
        } else if (playerOneSelection.equalsIgnoreCase("lizard") && playerTwoSelection.equalsIgnoreCase("spock")) {
            wins = playerOneSelection;
        } else if (playerOneSelection.equalsIgnoreCase("spock") && playerTwoSelection.equalsIgnoreCase("lizard")) {
            wins = playerTwoSelection;
        } else if (playerOneSelection.equalsIgnoreCase("spock") && playerTwoSelection.equalsIgnoreCase("scissors")) {
            wins = playerOneSelection;
        } else if (playerOneSelection.equalsIgnoreCase("scissors") && playerTwoSelection.equalsIgnoreCase("spock")) {
            wins = playerTwoSelection;
        } else if (playerOneSelection.equalsIgnoreCase("scissors") && playerTwoSelection.equalsIgnoreCase("lizard")) {
            wins = playerOneSelection;
        } else if (playerOneSelection.equalsIgnoreCase("lizard") && playerTwoSelection.equalsIgnoreCase("scissors")) {
            wins = playerTwoSelection;
        } else if (playerOneSelection.equalsIgnoreCase("lizard") && playerTwoSelection.equalsIgnoreCase("paper")) {
            wins = playerOneSelection;
        } else if (playerOneSelection.equalsIgnoreCase("paper") && playerTwoSelection.equalsIgnoreCase("lizard")) {
            wins = playerTwoSelection;
        } else if (playerOneSelection.equalsIgnoreCase("paper") && playerTwoSelection.equalsIgnoreCase("spock")) {
            wins = playerOneSelection;
        } else if (playerOneSelection.equalsIgnoreCase("spock") && playerTwoSelection.equalsIgnoreCase("paper")) {
            wins = playerTwoSelection;
        } else if (playerOneSelection.equalsIgnoreCase("spock") && playerTwoSelection.equalsIgnoreCase("Rock")) {
            wins = playerOneSelection;
        } else if (playerOneSelection.equalsIgnoreCase("rock") && playerTwoSelection.equalsIgnoreCase("spock")) {
            wins = playerTwoSelection;
        } else if (playerOneSelection.equalsIgnoreCase(playerTwoSelection)) {
            wins = "draw";
        } else {
            System.out.println("Error!! Something went wrong");
        }

        return wins;
    }

    //random number generator
    int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    //returns choice of each randomly generated number
    public String randomSetChoice() {
        int num = randomWithRange(-1, 3);
        String choice = "";

        switch (num) {
            case -1:
                choice = "scissors";
                break;

            case 0:
                choice = "rock";
                break;

            case 1:
                choice = "paper";
                break;

            case 2:
                choice = "lizard";
                break;

            case 3:
                choice = "spock";
                break;
        }

        return choice;

    }

    public String[] handleResults(String player1, String player1Selection, String player2, String player2Selection, String result) {
        //formats players data to be added to an arrayList
        
        //create an array of 5 elements
        String[] result_analysis = new String[5];
        result_analysis[0] = player1;
        result_analysis[1] = player1Selection;
        result_analysis[2] = player2;
        result_analysis[3] = player2Selection;
        result_analysis[4] = result;

        return result_analysis; //returns the created array list
    }

}
