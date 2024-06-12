public class InvertedPyramidPattern {

    public static void printInvertedPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5; 
        System.out.println("Inverted Pyramid Pattern:");
        printInvertedPyramid(rows);
    }
}
