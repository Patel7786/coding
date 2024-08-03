package OOPsConcept;

//compile time polymorphism :- overloading   //run time is overriding that is used in inheritance
class Bank {
    String Name;

    void getName() {
        this.Name = "default";
        System.out.println(" Hello ::" + this.Name);
    }

    String getName(int x) {
        return "Yamraj";
    }

    void getName(String Name) {
        this.Name = Name;
        System.out.println(" Hello ::" + this.Name);
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.getName();
        b.getName("Prajjawal");
        String s = b.getName(0);
        System.out.println(s);
    }
}
