package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
        System.out.println("Its area is " + getArea());
    }
}
