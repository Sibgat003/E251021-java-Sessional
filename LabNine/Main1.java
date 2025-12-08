class Student {
   
    private String name;
    private String id;
    private double cgpa;

    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

   
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}


public class Main1 {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        
        s1.setName("Sibgatul Islam");
        s1.setId("E251021");
        s1.setCgpa(3.645);

        
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student CGPA: " + s1.getCgpa());
    }
}
