public class Triangle extends Shape{
    double height;
    double base;

    public Triangle(String name, String color, double height, double base){
        this.name = name;
        this.color = color;
        this.height = height;
        this.base = base;
    }

    @Override
    double calculateArea() {
        return height * base / 2;
    }
}
