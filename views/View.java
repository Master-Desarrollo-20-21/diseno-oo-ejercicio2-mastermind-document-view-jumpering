package mastermindDocumentView.views;


import mastermindDocumentView.models.Game;
import mastermindDocumentView.models.Message;
import mastermindDocumentView.utils.IO;
import mastermindDocumentView.views.AttemptView;
import mastermindDocumentView.views.GameView;
import mastermindDocumentView.views.ResumeView;
import mastermindDocumentView.views.SecretCombinationView;

public class View {

    private SecretCombinationView secretCombinationView;
    private GameView gameView;
    private AttemptView attemptView;
    private ResumeView resumeView;
    private Game game;

    public View(Game game) {
        this.game = game;
        this.reset();

    }

    private void reset() {
        IO.getInstance().printText(Message.GAME_TITLE);
        gameView = new GameView(this.game);
        secretCombinationView = new SecretCombinationView();
        attemptView = new AttemptView(this.game);
        resumeView = new ResumeView();
    }

    public void interact(){
        do{
            do {
                attemptView.writeln(this.game.getNumOfAttempts());
                secretCombinationView.writeln();
                attemptView.interact(secretCombinationView.getSecretCombination());
                gameView.printAttempts();
            }while(!game.finished());
        } while (this.resumeView.interact());

    }

    public boolean isResumed(){

        return true;
    }
}
