package com.testProject.figures;

import com.testProject.figure.Figure;

public class Triangle extends Figure {
    private int Kat1;

    private int Kat2;

    private final String NAME_FIGURE = "Triangle";

    public Triangle() {
    }

    public Triangle(int kat1, int kat2) {
        super();
        Kat1 = kat1;
        Kat2 = kat2;
    }

    public int getHypot() {
        return (int) Math.sqrt(Kat1 * Kat1 + Kat2 * Kat2);
    }

    @Override
    public int getSquare() {
        return Kat1 * Kat2 / 2;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public int getKat1() {
        return Kat1;
    }

    public void setKat1(int kat1) {
        Kat1 = kat1;
    }

    public int getKat2() {
        return Kat2;
    }

    public void setKat2(int kat2) {
        Kat2 = kat2;
    }

    @Override
    public String toString() {
        return " Figure : " + NAME_FIGURE + ", square = " + getSquare() + " m2" + ", Hypotenuse = " + getHypot() + "M" + ", Color = " + getColor();
    }
}
