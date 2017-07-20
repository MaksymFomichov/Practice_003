package com.gmail.fomichov.m;

public class Circle {
    private int radius;
    private Point point;

    public Circle(int radius, Point point) {
        this.radius = radius;
        this.point = point;
    }

    public boolean collisionCheck(Circle circle) {
        return ((radius + circle.radius) >= point.calcLenght(circle.point));
    }
}
