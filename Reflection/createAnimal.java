package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.*;
import Reflection.Animal;

public class createAnimal {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Reflection.Animal"); // loading the Animal class
            Constructor[] DeclareConstructure = c.getDeclaredConstructors(); // getting all the declared constructure
            for (Constructor constructor : DeclareConstructure) {
                System.out.println(constructor.getName());
                constructor.setAccessible(true); // set the accesbility of constructre true
                Animal o = (Animal) constructor.newInstance(); // here we are create instance of Animal class which
                                                               // constructure is private due to that we are not able to
                                                               // create.

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
