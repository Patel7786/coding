package Tries;

import java.util.*;

class Tries {
    char data;
    Tries[] children = new Tries[26];
    boolean isTerminal;

    Tries(char data) {
        this.data = data;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
        isTerminal = false;
    }
}

class TriesImplementation {
    // insert into Tries
    public void insertIntoTries(Tries root, String word) {
        if (word.length() == 0) {
            root.isTerminal = true;
            return;
        }
        Tries child;
        // assume all the character into string is in Caps
        int index = word.charAt(0) - 'A';
        if (root.children[index] != null) {
            child = root.children[index];
        } else {
            child = new Tries(word.charAt(0));
            root.children[index] = child;
        }

        // Recursive Call
        insertIntoTries(child, word.substring(1));

    }

    // seaching into tries ---------------
    boolean SearchIntoTries(Tries root, String word) {
        if (word.length() == 0) {
            if (root.isTerminal)
                System.out.println("Congratulations !!!!  Present");
            else
                System.out.println("O No !!!!! Not Present");
            return root.isTerminal;
        }
        int index = word.charAt(0) - 'A';
        if (root.children[index] != null) {
            root = root.children[index];
            return SearchIntoTries(root, word.substring(1));
        } else {
            System.out.println("O No !!!!! Not Present");
            return false;
        }

    }

    // deletion into Tries ---------------
    void deletionIntoTries(Tries root, String word) {
        if (word.length() == 0) {
            root.isTerminal = false;
            root = null;
            return;
        }
        int index = word.charAt(0) - 'A';
        Tries child = root.children[index];
        deletionIntoTries(child, word.substring(1));
        root.children[index] = null;

    }

    void printTries(Tries root) {
        System.out.println("Print the element");
        while (!root.isTerminal) {
            System.out.print(root.data);
            int index = 0;
            while (root.children[index] == null) {
                index++;
            }
            root = root.children[index];
        }
        System.out.print(root.data);
    }

    // normal by me

    public static void main(String[] args) {
        Tries root = new Tries('0');
        TriesImplementation t = new TriesImplementation();
        t.insertIntoTries(root, "ABCD");
        t.insertIntoTries(root, "ABCA");
        // t.printTries(root);
        t.SearchIntoTries(root, "ABCD");
        // deletion
        System.out.println("After Deletion ------------");
        t.deletionIntoTries(root, "ABCA");
        t.SearchIntoTries(root, "ABCA");
    }
}