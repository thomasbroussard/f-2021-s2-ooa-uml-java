package fr.epita.geometry.datamodel;

public class Square implements Shape {


    private Rectangle rectangle;

    public Square(double side) {
        this.rectangle = new Rectangle(side,side);
    }

    public double getSide() {
        return this.rectangle.getHeight();
    }

    public void setSide(double side) {
        this.rectangle.setHeight(side);
    }

    public double calculatePerimeter(){
        return this.rectangle.calculatePerimeter();
    }

    public double calculateArea(){
        return this.rectangle.calculateArea();
    }

}
