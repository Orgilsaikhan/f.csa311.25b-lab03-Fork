package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    public Shape shape;
    
    Renderer(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        shape.draw();
    }
}
