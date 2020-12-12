package mastermindDocumentView.utils;

public class YesNoDialog {

    public static boolean read(String input) {
        char answerCharacter;
        do {
            answerCharacter = input.charAt(0);
        } while (answerCharacter != 'y' && answerCharacter != 'n');
        return answerCharacter == 'y';

    }
}
