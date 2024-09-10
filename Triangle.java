class Triangle extends Shape {
    double base;
    double height;

    public Triangle(String name, String color, double base, double height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public void displayTriangleDetails() {
        System.out.println("Triangle with base: " + base + " and height: " + height);
    }
}
