package Reflection;

//by using reflection api at run time we are created the Object of Animal which is not possible due to private constucture of Animal Class
class Animal {
    private int a;

    // constructure's are private so we can't create object
    private Animal() {
        System.out.println("Hii this is Animal Constructure");
    }

    // private Animal(int a) {
    // System.out.println("this is Animal constructure with a given value" + a);
    // }

    private void Show() {
        System.out.println("this is show" + a);
    }
}