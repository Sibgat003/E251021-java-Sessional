class Calculator {

   
    int add(int a, int b) {
        return a + b;
    }

    
    double add(double a, double b) {
        return a + b;
    }

    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}


public class Main1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        
        System.out.println("Sum of two integers: " + calc.add(77, 77));
        System.out.println("Sum of two doubles: " + calc.add(7.7, 5.5));
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));
    }
}
