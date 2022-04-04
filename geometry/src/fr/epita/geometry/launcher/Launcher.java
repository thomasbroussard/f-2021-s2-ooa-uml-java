package fr.epita.geometry.launcher;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Shape;
import fr.epita.geometry.datamodel.Square;
import fr.epita.geometry.datamodel.Triangle;

import java.util.Arrays;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {
        Shape t1 = new Triangle(20, 30, 25,10);

        Shape c1 = new Circle(20);

        Square s1 = new Square(10);

        List<Shape> shapes = Arrays.asList(t1, c1, s1);

        double area = 0.0;
        for (Shape shape : shapes){
            System.out.println(shape.calculatePerimeter());
            area += shape.calculateArea();
        }
        System.out.println("Global Area: " + area);



    }
}
