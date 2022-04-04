package fr.epita.geometry.datamodel;


public class Circle implements Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
       return Math.pow(this.radius,2) * Math.PI;
    }

    public double calculatePerimeter(){
        return Math.PI * 2 * this.radius;
    }

}
