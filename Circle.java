public class Circle extends Shape{

    double radius;

    public Circle(String name, String color, double radius){
        this.name = name;
        this.color = color;
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
