package mastermindDocumentView.views;

import mastermindDocumentView.models.Game;
import mastermindDocumentView.models.Message;
import mastermindDocumentView.utils.IO;

public class GameView {

    private Game game;
    private AttemptView attemptView;
    private SecretCombinationView secretCombinationView;

    public GameView(Game game) {
        this.game = game;
        this.game.resetAttemptList();
        this.attemptView = new AttemptView(game);
        secretCombinationView = new SecretCombinationView();
    }

    public void interact() {
        writeNumOfAttempts();
        writeSecretCombination();
        addAttempt();
        writeAttempts();
    }

    private void writeNumOfAttempts() {
        attemptView.writeln(this.game.getNumOfAttempts());
    }

    private void writeSecretCombination() {
        secretCombinationView.writeln();
    }

    private void addAttempt() {
        attemptView.interact(secretCombinationView.getSecretCombination());
    }

    private void writeAttempts() {
        for (int i = 0; i < this.game.getAttemptListSize(); i++) {
            AttemptView.writeColors(this.game.getAttempt(i));
        }
    }

    public void writeResult() {
        if (this.game.isWinner()) {
            IO.getInstance().printText(Message.WIN);
        } else if (this.game.isLooser()) {
            IO.getInstance().printText(Message.LOSSE);
        }
    }
}
