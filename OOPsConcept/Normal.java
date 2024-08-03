package OOPsConcept;

class Student {
    String Name;
    int Age;

    void printInfo() {
        System.out.println(this.Name);
        System.out.println(this.Age);
    }
}

public class Normal {
    public static void main(String[] args) {
        Student s = new Student();
        s.Name = "Prajjawal";
        s.Age = 23;
        s.printInfo();
    }
}
