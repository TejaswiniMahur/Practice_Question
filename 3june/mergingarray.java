import java.util.Arrays;

public class mergingarray {
    public static void main(String[] args) {
        int[] a = {1, -1, 0, 5, 2, 3, 3, 4, 4, 5, 6};

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1 && a[i] == a[i + 1]) {
                continue;
            }
            System.out.print(a[i] + " ");
        }
    }
}