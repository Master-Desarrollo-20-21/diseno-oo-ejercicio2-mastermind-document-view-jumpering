package mastermindDocumentView.views;

import mastermindDocumentView.Color;
import mastermindDocumentView.utils.IO;
import mastermindDocumentView.models.Message;
import mastermindDocumentView.models.ProposedCombination;

import java.util.HashSet;
import java.util.Set;

public class ProposedCombinationView {

    private String proposedInput;

    public ProposedCombinationView(){
        //read();
    }

    public ProposedCombination read(){
        ProposedCombination proposedCombination = new ProposedCombination();
        do {
            proposedInput = IO.getInstance().readText(Message.TEXT_PROPOSE.getText());
        } while (!isValid());
        for (int i = 0; i < proposedCombination.colors.length; i++) {
            proposedCombination.colors[i] = Color.valueOf(proposedInput.charAt(i));
        }
        return proposedCombination;
    }

    private boolean isValid() {

        return isValidLength() && isValidColors() && isUniqueChars();
    }

    private boolean isValidLength() {
        if (proposedInput.length() != 4) {
            IO.getInstance().printText(Message.TEXT_WRONG_PROPOSE_LENGTH.getText());
            return false;
        }
        return true;
    }

    private boolean isValidColors() {
        if (proposedInput.chars().filter(c -> Color.isValidColor((char) c)).count() != 4) {
            IO.getInstance().printText(Message.TEXT_WRONG_PROPOSE_COLORS.getText());
            return false;
        }
        return true;
    }

    private boolean isUniqueChars() {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < proposedInput.length(); i++) {
            if (!charSet.contains(proposedInput.charAt(i))) {
                charSet.add(proposedInput.charAt(i));
            }
        }
        if (charSet.size() != 4) {
            IO.getInstance().printText(Message.TEXT_WRONG_PROPOSE_REPEATED_COLORS.getText());
            return false;
        }
        return true;
    }
}
