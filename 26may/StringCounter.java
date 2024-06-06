

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


public class StringCounter {
    public static void main(String[] args) {
        String input = "111222333";
        String output = countConsecutive(input);
        System.out.println(output); // Output: "413233"
    }

    public static String countConsecutive(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(count);
                result.append(input.charAt(i - 1));
                count = 1;
            }
        }
        // Append the count of the last digit and the last digit itself
        result.append(count);
        result.append(input.charAt(input.length() - 1));
        return result.toString();
    }
}


import java.util.*;

public class ConsecutiveCount {
    public static String countConsecutive(int[] nums) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                result.append(count).append(nums[i]);
                count = 1;
            }
        }
        // Append the last element
        result.append(count).append(nums[nums.length - 1]);

        return result.toString();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 3, 3};
        System.out.println("Output: " + countConsecutive(arr));
    }
}
