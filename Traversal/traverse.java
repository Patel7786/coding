package Traversal;

import java.util.*;

public class traverse {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("prajjawal");
        l.add("Kumar");
        l.add("patel");
        // by for (Iterable)
        for (String s : l) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------");
        // by iterator
        Iterator<String> itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("-----------------------------------");

        // by ListIterator fasrowrd + backwork both possible
        ListIterator<String> litr = l.listIterator(l.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
        System.out.println("-----------------------------------");
        // method for each method
        l.forEach(str -> {
            System.out.println(str);
        });

    }
}
