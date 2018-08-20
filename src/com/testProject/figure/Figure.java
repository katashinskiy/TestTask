package com.testProject.figure;

public class Figure implements MainFigure {

    private final String[] colors = {"Red", "Green", "Blue", "Grey", "Black", "Purple", "Yellow", "White", "Golden", "Silver"};

    private int square;

    private String color;

    public Figure() {
        int colorIndex = (int) (Math.random()*10);
        String color = "No Color!!!";

        switch (colorIndex){
            case 0: color = colors[0]; break;
            case 1: color = colors[1]; break;
            case 2: color = colors[2]; break;
            case 3: color = colors[3]; break;
            case 4: color = colors[4]; break;
            case 5: color = colors[5]; break;
            case 6: color = colors[6]; break;
            case 7: color = colors[7]; break;
            case 8: color = colors[8]; break;
            case 9: color = colors[9]; break;
        }
        this.color = color;
    }

    @Override
    public int getSquare() {
        return square;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setSquare(int square) {
        this.square = square;
    }

}
