
class A {
    void methodA() {
        System.out.println("hello this is method A");
    }
}

class B extends A {
    void methodA() {
        System.out.println("hello this is method B");
    }

    public void methodB() {
        System.out.println("hello this is method B");
    }

}

public class Practice {

    public static void main(String[] args) {
        System.out.println(args.length);
        A a = new B();
        a.methodA();

    }
}
