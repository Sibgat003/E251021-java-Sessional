class GrandFather {
    String name = "Adnan";
    void company() {
        System.out.println(name + " Owns a company");
    }
}
class Father extends GrandFather {
    public Father() {
        this.name = "Mamun";
    }
    void car() {
        System.out.println(name + " Owns a car");
    }
}
class Son  extends Father {
    public Son(String n ) {
        this.name = n;
    }
    void lazy() {
        System.out.println("He is lazy");
    }
}
public class TaskOne {
    public static void main(String[] args) {
        Son son = new Son("Sibgat");
        son.company();
        son.car();
        son.lazy();
    }
}
