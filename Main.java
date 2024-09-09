public class Main{
    public static void main(String[] args) {

        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 7.0);
        Triangle triangle = new Triangle("Green", 3.0, 6.0);

        Shape shape1 = circle;     // Upcasting Circle to Shape
        Shape shape2 = rectangle;  // Upcasting Rectangle to Shape
        Shape shape3 = triangle;   // Upcasting Triangle to Shape

        shape1.displayInfo();
        shape2.displayInfo();
        shape3.displayInfo();

        if (shape1 instanceof Circle) {
            Circle specificCircle = (Circle) shape1;  // Downcast to Circle
            specificCircle.showRadius();
        }

        if (shape2 instanceof Rectangle) {
            Rectangle specificRectangle = (Rectangle) shape2;  // Downcast to Rectangle
             specificRectangle.showDimensions();
        }

        if (shape3 instanceof Triangle) {
            Triangle specificTriangle = (Triangle) shape3;  // Downcast back to Triangle
            specificTriangle.showDimensions();
        }

        // Example of incorrect downcasting (would throw a ClassCastException if uncommented)
        // Circle wrongDowncast = (Circle) shape2; // Attempting to cast Rectangle to Circle
    }
}
