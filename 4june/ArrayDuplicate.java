
// public class arrayduplicate {
//     public static void main(String[] args) {
//         int[] a= {1-1,-1,0,5,2,3,3,4,4,5,6};
        

//         int j=0;

//         for(int i=0;i<a.length-1;i++){
//             if(a[i] != a[i+1]){
//                 temp[j]= a[i];
//                 j++;
//             }
//         }
        
//         temp[j] = a[a.length-1];

//         for(int i=0;i<=j;i++){
//             if(temp[i]!=0);
//             System.out.println(temp[i]+" ");
//         }
//     }
    
// }
// public class arrayduplicate {
//     public static void main(String[] args) {
//         int[] a = {1-1, -1, 0, 5, 2, 3, 3, 4, 4, 5, 6};
//         int[] temp = new int[a.length];
//         int j = 0;

//         for (int i = 0; i < a.length - 1; i++) {
//             if (a[i] != a[i + 1]) {
//                 temp[j] = a[i];
//                 j++;
//             }
//         }
//         temp[j] = a[a.length - 1];

        
//         for (int i = 0; i <= j; i++) {
//             if (temp[i] != 0) { 
//                 System.out.print(temp[i] + " ");
//             }
//         }
//     }
// }

// public class arrayduplicate {
//     public static void main(String[] args) {
//         int[] a = {1-1, -1, 0, 5, 2, 3, 3, 4, 4, 5, 6};
//         int[] temp = int [a.length];
//         int j = 0;

//         for (int i = 0; i < a.length - 1; i++) {
//             if (a[i] != a[i + 1]) {
//                 temp[j] = a[i];
//                 j++;
//             }
//         }
//         temp[j] = a[a.length - 1];
//         for (int i = 0; i <= j; i++) {
//             if (temp[i] != 0) { 
//                 System.out.print(temp[i] + " ");
//             }
//         }
//     }
// }



import java.util.Arrays;

public class ArrayDuplicate {
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
