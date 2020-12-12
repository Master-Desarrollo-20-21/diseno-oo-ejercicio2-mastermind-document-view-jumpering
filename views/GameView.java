package mastermindDocumentView.views;

import mastermindDocumentView.models.Game;
import mastermindDocumentView.utils.IO;

public class GameView {

    private Game game;

    public GameView(Game game){
        this.game = game;
    }

    public void printAttempts(){

        for (int i = 0; i < this.game.getAttemptList().size(); i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(this.game.getAttemptList().get(i).getProposedCombination().colors[j]);
            }
            IO.getInstance().printText(" --> "
                    + this.game.getAttemptList().get(i).getPiecesBlack()
                    +  " blacks and "
                    + this.game.getAttemptList().get(i).getPiecesWhite()
                    + " whites"
                    + "\n");
        }
    }
}
