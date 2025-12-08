class Shape {
    double area(double length, double width) {
        return length * width;
    }
    double area(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Shape shape = new Shape();

        
        double rectangleArea = shape.area(21.0, 10.0);
        System.out.println("Area of Rectangle: " + rectangleArea);

        double circleArea = shape.area(21.0);
        System.out.println("Area of Circle: " + circleArea);
    }
}
