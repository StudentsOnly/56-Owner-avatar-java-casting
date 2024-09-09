public class Rectangle extends Shape{

    double width;
    double length;

    public Rectangle(String name, String color, double width, double length){
        this.name = name;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    @Override
    double calculateArea() {
        return width * length;
    }
}
