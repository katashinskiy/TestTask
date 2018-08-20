package com.testProject;

import com.testProject.figures.Circle;
import com.testProject.figures.Square;
import com.testProject.figures.Trapezium;
import com.testProject.figures.Triangle;
import com.testProject.figure.Figure;

import static com.testProject.random.Random.getRandom;

public class TestApplication {
    public static void main(String args[]) {

        int count = 0;
        int size = (int) (Math.random() * 10) + 1;

        int[] FigureInit = new int[size];

        for (int i = 0; i < FigureInit.length; i++) {
            FigureInit[i] = (int) (Math.random() * 4) + 1;
        }

        Figure[] arrFigure = new Figure[size];

        while (count != size) {

            switch (FigureInit[count]) {
                case 1:
                    arrFigure[count] = new Circle(getRandom());
                    break;
                case 2:
                    arrFigure[count] = new Triangle(getRandom(), getRandom());
                    break;
                case 3:
                    arrFigure[count] = new Square(getRandom());
                    break;
                case 4:
                    arrFigure[count] = new Trapezium(getRandom(), getRandom(), getRandom());
                    break;
            }

            count++;
        }

        for (Figure anArrFigure : arrFigure) {
            System.out.println(anArrFigure.toString());
        }
    }

}
