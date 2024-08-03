package bank;

import OOPsConcept.*; //importing package

//import bank.*; //if we import this package in any another package(folder) then we need but here we don't need beacuse we are in same package

public class Bank1 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.Name = "Customer";
        b.Age = 23;
        b.getInfo();
        System.out.println(b.getClass());

    }

}
