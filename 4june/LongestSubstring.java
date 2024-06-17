public class PyramidPattern {

    public static void printPyramid(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5; 
        System.out.println("Pyramid Pattern:");
        printPyramid(rows);
    }
}
public class LongestSubstring {
    public static void main(String[] args) {
        String input = "abcbba";
        int maxLength = 0;
        int currentLength = 1;

        // Iterate through the string starting from the second character
        for (int i = 1; i < input.length(); i++) {
            // If current character is equal to previous character, increment current length
            if (input.charAt(i) == input.charAt(i - 1)) {
                currentLength++;
            } else {
                // If current character is different from previous, update maxLength if necessary
                maxLength = Math.max(maxLength, currentLength);
                // Reset current length for the new substring
                currentLength = 1;
            }
        }

        maxLength = Math.max(maxLength, currentLength);

        System.out.println("The length of the longest substring with all characters the same is: " + maxLength);
    }
}
