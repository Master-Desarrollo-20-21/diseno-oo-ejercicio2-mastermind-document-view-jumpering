package mastermindDocumentView.views;

import mastermindDocumentView.models.Message;
import mastermindDocumentView.utils.IO;
import mastermindDocumentView.utils.YesNoDialog;

public class ResumeView {

    public boolean interact() {
        String userAnswer = IO.getInstance().readText( Message.RESUME_ANSWER.getText());
        if (YesNoDialog.read(userAnswer)){
            return true;
        }
        return false;
    }
}
