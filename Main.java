public class Main{
    public static void main(String[] args) {

        Shape circle = new Circle("circle", "blue", 13);    //Upcasting
        Shape rectangle = new Rectangle("rectangle", "yellow", 13.5, 15);   //Upcasting
        Shape triangle = new Triangle("triangle", "red", 15.2, 9.9);    //Upcasting

        displayArea(circle);
        displayArea(rectangle);
        displayArea(triangle);

        Circle circ = (Circle) circle;  //Downcasting
        System.out.println("Radius = " + String.format("%.2f",circ.radius));



    }

    static void displayArea(Shape shape){
        System.out.println("area of " + shape.name + " = " + String.format("%.2f", shape.calculateArea()));
    }
}
