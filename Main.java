public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", "Red", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle", "Blue", 4.0, 6.0);
        Triangle triangle = new Triangle("Triangle", "Green", 3.0, 8.0);

        // --------- Upcasting ---------
        Shape shape1 = circle;
        Shape shape2 = rectangle;
        Shape shape3 = triangle;

        System.out.println(shape1.name + " area: " + shape1.calculateArea());
        System.out.println(shape2.name + " area: " + shape2.calculateArea());
        System.out.println(shape3.name + " area: " + shape3.calculateArea());

        // --------- Downcasting ---------
        if (shape1 instanceof Circle) {
            Circle specificCircle = (Circle) shape1;
            specificCircle.displayCircleDetails();
        }

        if (shape2 instanceof Rectangle) {
            Rectangle specificRectangle = (Rectangle) shape2;
            specificRectangle.displayRectangleDetails();
        }

        if (shape3 instanceof Triangle) {
            Triangle specificTriangle = (Triangle) shape3;
            specificTriangle.displayTriangleDetails();
        }
    }
}
