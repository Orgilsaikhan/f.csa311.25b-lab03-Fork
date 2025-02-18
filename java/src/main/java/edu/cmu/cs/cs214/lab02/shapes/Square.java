package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    public double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    public double getArea() {
        return sideLen * sideLen;
    }
    public void draw() {
        System.out.println("Drawing a Square with side length " + sideLen);
        System.out.println("Its area is " + getArea());
    }
}
