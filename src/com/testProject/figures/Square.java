package com.testProject.figures;

import com.testProject.mainFigure.Figure;

public class Square extends Figure {

    private int side;

    private final String NAME_FIGURE = "Square";

    public Square() {
    }

    public Square(int side) {
        super();
        this.side = side;
    }


    @Override
    public int getSquare() {
        return side*side;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public int getSide(){
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return " Figure : " + NAME_FIGURE + ", square = " + getSquare() + " m2" + ", side = " + getSide() + "M" + ", Color = " + getColor();
    }
}
