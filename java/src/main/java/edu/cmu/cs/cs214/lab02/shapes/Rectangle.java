package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    public double height;
    public double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }
    public void draw() {
        System.out.println("Drawing a Rectangle with height " + height + " and width " + width);
        System.out.println("Its area is " + getArea());
    }
}
