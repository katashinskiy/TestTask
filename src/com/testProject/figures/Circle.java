package com.testProject.figures;

import com.testProject.figure.Figure;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Figure {

    private int radius;

    private int length;

    private final String NAME_FIGURE = "Circle";

    public Circle() {

    }

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    @Override
    public int getSquare() {
        return (int) (PI * pow(radius, 2));
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return (int) (2 * PI + radius);
    }

    @Override
    public String toString() {
        return " Figure : " + NAME_FIGURE + ", square = " + getSquare() + " m2" + ", length = " + getLength() + "M" + ", Color = " + getColor();
    }
}
