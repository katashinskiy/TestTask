package com.testProject.figures;

import com.testProject.mainFigure.Figure;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Figure {

    private int radiuse;

    private int length;

    private final String NAME_FIGURE = "Circle";

    public Circle() {

    }

    public Circle(int radiuse) {
        super();
        this.radiuse = radiuse;
    }

    @Override
    public int getSquare() {
        return (int) (PI*pow(radiuse,2));
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public int getRadiuse() {
        return radiuse;
    }

    public void setRadiuse(int radiuse) {
        this.radiuse = radiuse;
    }

    public int getLength() {
        return (int) (2*PI+radiuse);
    }

    @Override
    public String toString() {
        return " Figure : " + NAME_FIGURE + ", square = " + getSquare() + " m2" + ", length = " + getLength() + "M" + ", Color = " + getColor();
    }
}
