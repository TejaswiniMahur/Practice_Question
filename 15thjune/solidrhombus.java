import java.util.Scanner;

public class solidrhombus {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter rows");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++);
        }
        
    }
    
}
