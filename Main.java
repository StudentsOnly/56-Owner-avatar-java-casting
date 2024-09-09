public class Main {
    public static void main(String[] args) {
        // Upcasting
        Shape triangleShape = new Triangle(2, 3);
        Shape circleShape = new Circle(5);
        Shape rectangleShape = new Rectangle(5, 10);

//        System.out.println(circleS.radius); // can't access

        System.out.println(triangleShape.calculateArea());
        System.out.println(circleShape.calculateArea());
        System.out.println(rectangleShape.calculateArea());

        //Down-casting
        Circle circle = (Circle) circleShape;
        Triangle triangle = (Triangle) triangleShape;
        Rectangle rectangle = (Rectangle) rectangleShape;

        System.out.println(circle.radius);
        System.out.println(triangle.base);
        System.out.println(rectangle.width);
    }

}
