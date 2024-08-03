package OOPsConcept;

import java.util.*;

//creating a basic clss
class Animal {
    String Name;
    String color;
    int Age;

    void printInfo() {
        System.out.println(this.Name);
        System.out.println(this.color);
        System.out.println(this.Age);
    }
}

class Tiger extends Animal {
    String brid;

    @Override
    void printInfo() {
        System.out.println("tiger------------------------------printInfo");
        System.out.println(this.Name);
        System.out.println(this.color);
        System.out.println(this.Age);
        System.out.println(this.brid);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        /*
         * Animal s = new Animal();
         * s.Name = "Animal1";
         * s.Age = 23;
         * s.color = "Black";
         * s.printInfo();
         * 
         * Tiger t = new Tiger();
         * t.Name = "Tiger1";
         * t.Age = 12;
         * t.brid = "Amarican";
         * t.color = "Brown";
         * t.printInfo();
         */
        /// Tiger a=(Tiger)new Animal();
        // not converted into Animal

        Animal a1 = new Tiger(); // created tiger object of type animal that is taken all the property of animal
        // with in tiger
        a1.color = "yes";
        a1.Age = 22;
        // a1.brid = "scmndfl";
        a1.printInfo();

    }
}
