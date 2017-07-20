package com.gmail.fomichov.m;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        System.out.println("Расстояние между точками " + a.calcLenght(b));
        Circle circle1 = new Circle(10, a);
        Circle circle2 = new Circle(10, b);
        System.out.println("Окружности " + circle1.collisionCheck(circle2));
        CircleGenerator circleGenerator = new CircleGenerator();
        circleGenerator.generate(10);
        System.out.println("Столкновений " + circleGenerator.calcCountOfCollisions());
    }
}
