class Triangle extends Shape {
    double base, height;

    public Triangle(String color, double base, double height) {
        super("Triangle", color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Unique method for Triangle
    public void showDimensions() {
        System.out.println(name +  " Base: " + base + ", Height: " + height);
    }
}