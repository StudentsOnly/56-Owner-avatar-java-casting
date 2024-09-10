class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public void displayRectangleDetails() {
        System.out.println("Rectangle with width: " + width + " and height: " + height);
    }
}
