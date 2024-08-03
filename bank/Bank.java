package bank;

public class Bank {
    public String Name;
    public int Age;

    public Bank() {
        System.out.println("Welcome to Bank");
    }

    void getInfo() {
        System.out.println("Name: " + this.Name + " Age: " + this.Age);
    }
}
