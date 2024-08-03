package OOPsConcept;

abstract class Animal {
    Animal() {
        System.out.println("created Animal-----");
    }

    abstract void walk();

}

class Horse extends Animal {

    void walk() {
        System.out.println("Horse have 4 legs and walk---");
    }
}

abstract class Sunstar {
    Sunstar() {
        System.out.println("Welcome to SunStar...");
    }

    abstract void printInfo();
}

// Abstraction performed using extends
class Employee extends Sunstar {
    Employee() {
        System.out.println("Ecmployee comes.....");
    }

    void printInfo() {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        /*
         * Sunstar s = new Employee();
         * s.printInfo();
         */
        Animal horse = new Horse();
        horse.walk();
    }
}
