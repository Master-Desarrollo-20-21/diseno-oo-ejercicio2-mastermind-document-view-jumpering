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

    public int getColorsLength(){
        return this.colors.length;
    }

    public Color getColor(int colorNum){
        return this.colors[colorNum];
    }

    public void setColor(int colorNum, Color color){
        this.colors[colorNum] = color;
    }
}