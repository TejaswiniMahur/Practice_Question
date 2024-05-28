

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age){
       if (age > 0) this.age = age;}
}

public class encapsulation {
    public static void main(String[] args) {
        Person person = new Person("John", 30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Alice");
        person.setAge(25);

        System.out.println("Updated name: " + person.getName());
        System.out.println("Updated age: " + person.getAge());
    }
}

