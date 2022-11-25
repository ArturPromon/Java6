package com.company;

public class MainAbstract {
    public static void main(String[] args) {
        FigureAbstract circle = new CicrleAbstract();
        FigureAbstract triangle = new TriangleAbstract();

        circle.draw();
        triangle.draw();
    }
}
