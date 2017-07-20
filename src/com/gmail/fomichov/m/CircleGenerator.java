package com.gmail.fomichov.m;

public class CircleGenerator {
    private Circle[] circles;

    public void generate(int count) {
        circles = new Circle[count];
        for (int i = 0; i < count; i++) {
            circles[i] = new Circle(randomRadius(), new Point(randomPoint(), randomPoint()));
        }
    }

    public int calcCountOfCollisions() {
        int count = 0;

        for (int i = 0; i < circles.length; i++) {
            for (int j = i + 1; j < circles.length; j++) {
                if (circles[i].collisionCheck(circles[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private int randomRadius() {
        int minimum = 0;
        int maximum = 100;
        return minimum + (int) (Math.random() * maximum);
    }

    private double randomPoint() {
        double minimum = 0;
        double maximum = 100;
        return minimum + (double) (Math.random() * maximum);
    }
}
