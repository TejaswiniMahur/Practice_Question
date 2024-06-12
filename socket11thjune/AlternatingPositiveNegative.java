import java.util.Arrays;

public class AlternatingPositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }

    public static void rearrange(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                
                if (arr[i] >= 0) {
                    
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] < 0) {
                            
                            swap(arr, i, j);
                            break;
                        }
                    }
                }
            } else {
                
                if (arr[i] < 0) {
                    
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] >= 0) {
                            
                            swap(arr, i, j);
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
