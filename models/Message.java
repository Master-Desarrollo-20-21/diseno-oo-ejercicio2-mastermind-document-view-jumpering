package mastermindDocumentView.models;

public enum Message {
    GAME_TITLE ("-----MASTERMIND-----"),
    RESUME_ANSWER ("¿RESUME? (y/n): "),
    TEXT_PROPOSE ("Propose a combination: "),
    TEXT_WRONG_PROPOSE_LENGTH("Wrong proposed combination length"),
    TEXT_WRONG_PROPOSE_COLORS("Wrong colors, they must be: rbygop"),
    TEXT_WRONG_PROPOSE_REPEATED_COLORS("Repeated colors not allowed");
    private final String message;

    private Message(String message) {
        this.message = message;
    }

    public String getText(){
        return message;
    }

    public String toString() {
        return this.message;
    }

}
