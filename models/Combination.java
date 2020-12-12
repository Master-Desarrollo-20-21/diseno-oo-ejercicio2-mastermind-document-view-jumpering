package mastermindDocumentView.models;

import java.util.Arrays;

public abstract class Combination {

    protected Color[] colors;
    private static final int COMBINATION_LENGTH = 4;

    public Combination(){
        colors = new Color[COMBINATION_LENGTH];
    }

    public boolean hasColor(Color color){

        return Arrays.stream(colors).anyMatch(color::equals);
    }

    public int getCombinationLength(){
        return COMBINATION_LENGTH;
    }

    public abstract String toString();

}