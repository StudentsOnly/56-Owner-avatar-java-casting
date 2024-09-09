abstract class Shape {
    String name;
    String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println(name + " Color: " + color + ", Area: " + calculateArea());
        System.out.println();
    }
}