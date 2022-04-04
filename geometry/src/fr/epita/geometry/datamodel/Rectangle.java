package fr.epita.geometry.datamodel;

public class Rectangle implements Shape{

    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
