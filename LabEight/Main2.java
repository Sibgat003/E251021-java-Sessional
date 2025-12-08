class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}


public class Main2 {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        Circle s2 = new Circle();
        Rectangle s3 = new Rectangle();

        
        s1.draw();  
        s2.draw();  
        s3.draw();  
    }
}
