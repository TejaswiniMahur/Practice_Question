
interface Swimming {
    void swim();
}

interface Flying {
    void fly();
}

class Duck implements Swimming, Flying {
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    public void fly() {
        System.out.println("Duck is flying.");
    }
}

