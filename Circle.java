class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Unique method for Circle
    public void showRadius() {
        System.out.println(name +  " Radius: " + radius);
    }
}