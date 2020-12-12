package mastermindDocumentView.models;

public class Attempt {

    private ProposedCombination proposedCombination;
    private SecretCombination secretCombination;
    private int piecesBlack;
    private int piecesWhite;

    private final int BLACK_PIECES_FOR_WIN = 4;

    public Attempt(SecretCombination secretCombination) {
       this.secretCombination = secretCombination;
        this.piecesBlack = 0;
        this.piecesWhite = 0;
    }

    public boolean isWinner(){
        return this.piecesBlack == BLACK_PIECES_FOR_WIN;
    }

    public void read(ProposedCombination proposedCombination){
        this.proposedCombination = proposedCombination;
        this.piecesBlack = secretCombination.getBlacks(this.proposedCombination);
        this.piecesWhite = secretCombination.getWhites(this.proposedCombination);
    }

//    public String toString(){
//        return this.proposedCombination.toString() + " --> " + this.piecesBlack + " blacks and " + this.piecesWhite + " whites";
//    }

    public int getPiecesBlack() {
        return piecesBlack;
    }

    public int getPiecesWhite() {
        return piecesWhite;
    }

    public ProposedCombination getProposedCombination(){
        return this.proposedCombination;
    }
}
