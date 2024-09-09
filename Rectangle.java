class Rectangle extends Shape {
    double width, height;

    public Rectangle(String color, double width, double height) {
        super("Rectangle", color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    // Unique method for Rectangle
    public void showDimensions() {
        System.out.println(name +  " Width: " + width + ", Height: " + height);
    }
}