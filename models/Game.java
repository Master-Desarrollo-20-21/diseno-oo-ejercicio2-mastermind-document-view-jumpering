package mastermindDocumentView.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Attempt> attemptList;
    private SecretCombination secretCombination;
    private static final int ATTEMPTS = 10;

    public Game(){
        this.attemptList = new ArrayList<>();
        this.secretCombination = new SecretCombination();
    }

    public void addAttempt(Attempt attempt){
        attemptList.add(attempt);
    }

    public int getNumOfAttempts() {
        return attemptList.size();
    }

    public List<Attempt> getAttemptList() {
        return attemptList;
    }

    public boolean finished() {

        return true;
    }
}