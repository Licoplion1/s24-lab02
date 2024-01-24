package edu.cmu.cs.cs214.lab02;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape shapes = new Rectangle(4, 3);

        Renderer renderer = new Renderer(shapes);

        renderer.draw();
    }
}
