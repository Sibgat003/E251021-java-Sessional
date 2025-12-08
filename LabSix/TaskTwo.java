class Person {
    void displayInfo() {
        System.out.println("I am Sibgat.");
    }
}


class Doctor extends Person {
    void treatPatients() {
        System.out.println("I treat patients and save lives.");
    }
}


class Teacher extends Person {
    void teachStudents() {
        System.out.println("I teach students and share knowledge.");
    }
}


class Engineer extends Person {
    void buildSolutions() {
        System.out.println("I build technological solutions.");
    }
}


public class TaskTwo {
    public static void main(String[] args) {
        
        Doctor s1 = new Doctor();
        Teacher s2 = new Teacher();
        Engineer s3 = new Engineer();

       
        s1.displayInfo();
        s1.treatPatients();

        s2.displayInfo();
        s2.teachStudents();

        s3.displayInfo();
        s3.buildSolutions();
    }
}
