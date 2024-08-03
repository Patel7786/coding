package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//by using Adjcency Matrix----------------------
class Implementation<T> {
    HashMap<T, ArrayList<T>> map = new HashMap<>();

    public void addEdge(T u, T v, int direction) {
        if (map.containsKey(u)) {
            map.get(u).add(v);
        } else {
            ArrayList<T> list = new ArrayList<>();
            list.add(v);
            map.put(u, list);
        }
        // for undirected graph-------------
        if (direction == 0) {
            if (map.containsKey(v)) {
                map.get(v).add(u);
            } else {
                ArrayList<T> list = new ArrayList<>();
                list.add(u);
                map.put(v, list);
            }
        }
    }

    public void printfunction() {
        System.out.println(map);

    }

    public static void main(String[] args) {
        System.out.println("Hello family !!!   Welcome to Graph !!!!----------");
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        Implementation<Character> m = new Implementation<>();
        while (flag) {
            System.out.println("Please Enter Edges");
            char n = sc.next().charAt(0);
            char e = sc.next().charAt(0);
            m.addEdge(n, e, 0); // undirected graph

            System.out.println("You want to add more node the please enter");
            System.out.println("true");
            System.out.println("false");
            flag = sc.nextBoolean();
            if (!flag)
                m.printfunction();
        }

    }
}