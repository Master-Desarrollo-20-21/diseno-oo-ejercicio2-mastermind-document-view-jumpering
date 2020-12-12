package mastermindDocumentView.views;

import mastermindDocumentView.utils.IO;
import mastermindDocumentView.models.SecretCombination;

public class SecretCombinationView {

    private SecretCombination secretCombination;

    public SecretCombinationView(){
        this.secretCombination = new SecretCombination();
    }

    public void writeln() {
        StringBuilder asteriskCombination = new StringBuilder();
        for (int i = 0; i < 4; i++) {//TODO
            asteriskCombination.append("*");
        }
        IO.getInstance().printText(asteriskCombination);
    }

    public SecretCombination getSecretCombination(){
        return this.secretCombination;
    }
}
