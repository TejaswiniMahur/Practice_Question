
class Grandparent {
    void sayHello() {
        System.out.println("Hello from Grandparent!");
    }
}

class Parent extends Grandparent {
    void sayHi() {
        System.out.println("Hi from Parent!");
    }
}

class Child extends Parent {
    void greet() {
        System.out.println("Greetings from Child!");
    }
}

