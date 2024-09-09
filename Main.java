import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>(List.of(
                new Circle(2.0),
                new Rectangle(2.0, 2.0),
                new Triangle(2.0, 2.0)
        ));

        shapes.forEach(s -> System.out.println("Area of " + s.getClass().getSimpleName() + " : " +
                "%.2f".formatted(s.calculateArea())));

        System.out.println("-".repeat(90));
        shapes.forEach(s -> System.out.println(
            switch (s) {
                case  Circle circle -> "Radius of Circle: " +
                        circle.getRadius();
                case  Rectangle rectangle -> "Width, height of Rectangle: " +
                        rectangle.getWidth() + ", " + rectangle.getHeight();
                case  Triangle triangle -> "Width, height of Triangle: " +
                        triangle.getBase() + ", " + triangle.getHeight();
                default -> "No subtype of shape recognized.";
        }));


    }

}
