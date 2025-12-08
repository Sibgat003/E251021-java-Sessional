class Animal {
    void sound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


public class Main1 {
    public static void main(String[] args) {
        
        Animal s1 = new Animal();
        Dog s2 = new Dog();
        Cat s3 = new Cat();

        
        s1.sound();  
        s2.sound();  
        s3.sound();  
    }
}
