package tut8.abstract_factory;

/* Create the AbstractFactoryTest class which uses the FactoryProducer
 * to get AbstractFactory in order to get factories
 * of concrete classes by passing an information such as type.
 */

public class AbstractFactoryTest {
    //TO-DO: Implement the main() method for testing purpose
    public static void main(String[] args) {
        // get shape factory
        ShapeFactory shapeFactory = (ShapeFactory) FactoryProducer.getFactory(false);
        // get an object of Shape Rectangle
        Shape rectangleShape = shapeFactory.getShape("rectangle");
        // call draw method of Shape Rectangle
        rectangleShape.draw();
        // get an object of Shape Square
        Shape squareShape = shapeFactory.getShape("square");
        // call draw method of Shape Square
        squareShape.draw();
        // get shape factory
        RoundedShapeFactory roundedShapeFactory = (RoundedShapeFactory) FactoryProducer.getFactory(true);
        // get an object of Shape Rectangle
        Shape roundedRect = roundedShapeFactory.getShape("rounded rectangle");
        // call draw method of Shape Rectangle
            roundedRect.draw();
        // get an object of Shape Square

        Shape roundedSquare = roundedShapeFactory.getShape("rounded square");
        // call draw method of Shape Square
        roundedSquare.draw();
    }
}