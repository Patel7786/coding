package OOPsConcept;

class Account {
    protected int account_Number;
    protected String Name;
    private int Balance;

    Account(int account_Number, String Name, int Balance) {
        this.Balance = Balance;
        this.Name = Name;
        this.account_Number = account_Number;
    }

    public int getBalance() {
        return this.Balance;
    }

    public void Details() {
        System.out.println("Details of " + this.Name);
        System.out.println("Account Number  : " + this.account_Number);
        System.out.println("Balance : " + this.Balance);

    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account account = new Account(1234, "Prajjawal", 123344559);
        account.Details();

    }
}
