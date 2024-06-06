 public class arraychecker {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};

        boolean isEqual = areArraysEqual(a, b);
        if(isEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }

    public static boolean areArraysEqual(int[] a, int[] b) {
       
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
