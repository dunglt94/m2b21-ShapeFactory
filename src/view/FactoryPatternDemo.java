package view;


import model.Shape;
import model.ShapeFactory;
import model.ShapeType;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1 = shapeFactory.getShape(ShapeType.CIRCLE);
        s1.draw();

        Shape s2 = shapeFactory.getShape(ShapeType.RECTANGLE);
        s2.draw();

        Shape s3 = shapeFactory.getShape(ShapeType.SQUARE);
        s3.draw();

    }
}
