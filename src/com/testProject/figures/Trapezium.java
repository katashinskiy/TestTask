package com.testProject.figures;

import com.testProject.mainFigure.Figure;

public class Trapezium extends Figure {

    private int baseA;

    private int baseB;

    private int h;

    private final String NAME_FIGURE = "Trapezium";

    public Trapezium() {
    }

    public Trapezium(int catA, int catB, int h) {
        super();
        this.baseA = catA;
        this.baseB = catB;
        this.h = h;
    }

    @Override
    public int getSquare() {
        return (baseA* baseB)/2*h;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public int getCatA() {
        return baseA;
    }

    public void setCatA(int catA) {
        this.baseA = catA;
    }

    public int getBaseB() {
        return baseB;
    }

    public void setBaseB(int baseB) {
        this.baseB = baseB;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getMiddleLine(){
        return (int) baseA*baseB/2;
    }

    public String getNameFigure() {
        return NAME_FIGURE;
    }

    @Override
    public String toString() {
        return " Figure : " + NAME_FIGURE + ", square = " + getSquare() + " m2" + ", Middle line = " + getMiddleLine()+ "M" + ", Color = " + getColor();
    }

}
