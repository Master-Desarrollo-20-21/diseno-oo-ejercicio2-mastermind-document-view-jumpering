package mastermindDocumentView.views;

import mastermindDocumentView.models.Attempt;
import mastermindDocumentView.models.Game;
import mastermindDocumentView.utils.IO;
import mastermindDocumentView.models.SecretCombination;

public class AttemptView {

    private Game game;
    private Attempt attempt;
    private ProposedCombinationView proposedCombinationView;

    public AttemptView(Game game) {
        this.game = game;
    }

    public void writeln(int attempts) {
        IO.getInstance().printText(attempts + " Attempt(s):");
    }

    public void interact(SecretCombination secretCombination) {
        this.attempt = new Attempt(secretCombination);
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView();
        attempt.read(proposedCombinationView.read());
        this.game.addAttempt(attempt);
    }
}
