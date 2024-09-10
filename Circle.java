class Circle extends Shape {
    double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayCircleDetails() {
        System.out.println("Circle with radius: " + radius);
    }
}
