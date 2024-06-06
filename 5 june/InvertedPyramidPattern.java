public class InvertedPyramidPattern {

    public static void printInvertedPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            // Print spaces before the stars
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the inverted pyramid
        System.out.println("Inverted Pyramid Pattern:");
        printInvertedPyramid(rows);
    }
}
