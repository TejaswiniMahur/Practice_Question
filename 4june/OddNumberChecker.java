import java.util.List;

public class OddNumberChecker {

    public static boolean containsOnlyOddNumbers(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 3, 5, 7, 9);
        System.out.println("List contains only odd numbers: " + containsOnlyOddNumbers(numbers1)); // Output: true

        List<Integer> numbers2 = List.of(1, 2, 3, 5, 7, 9);
        System.out.println("List contains only odd numbers: " + containsOnlyOddNumbers(numbers2)); // Output: false
    }
}
