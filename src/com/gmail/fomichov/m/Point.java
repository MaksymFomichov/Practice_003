package com.gmail.fomichov.m;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcLenght(Point point) {
        double result = Math.sqrt((Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2)));
        return result;
    }
}
