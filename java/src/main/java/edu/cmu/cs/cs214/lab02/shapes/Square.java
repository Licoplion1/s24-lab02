package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    /**
     * public getter for side length.
     * @return sideLen
     */
    public double getSideLen() {
        return sideLen;
    }

    public double getArea() {
        return sideLen * sideLen;
    }
}
