## Exercise: Upcasting and Downcasting - Shape Hierarchy

#### Objective:

- Practice upcasting and downcasting in Java by creating a program that models a hierarchy of geometric shapes.

#### Description:

- Create a set of classes representing different shapes (e.g., Circle, Rectangle, Triangle) and their properties, and then use upcasting and downcasting to access specific features of these shapes.

#### Instructions:

#### Shape Hierarchy:

- Create an abstract base class called Shape with common attributes shared by all shapes (e.g., name, color).
- Create three subclasses: Circle, Rectangle, and Triangle, representing specific shapes.
- Add unique attributes and behaviors to each subclass (e.g., Circle has a radius, Rectangle has width and height, Triangle has base and height).
- Implement an abstract method in the Shape class called calculateArea() that calculates and returns the area of the shape.

#### Upcasting:

- In the main method, create instances of Circle, Rectangle, and Triangle objects.
- Use upcasting to assign these objects to references of the Shape class.
- Call the calculateArea() method for each shape to calculate and display its area.

#### Downcasting:

- Use downcasting to access the specific attributes and behaviors of Circle, Rectangle, and Triangle objects.
- For example, if you upcast a Rectangle object to a Shape reference, downcast it back to a Rectangle reference and access the width and height attributes.
