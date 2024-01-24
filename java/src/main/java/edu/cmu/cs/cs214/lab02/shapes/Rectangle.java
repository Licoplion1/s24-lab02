package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height;
    private double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    /**
     * public getter for height.
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * public getter for width.
     * @return width
     */
    public double getWidth() {
        return width;
    }

    public double getArea() {
        return height * width;
    }
}
