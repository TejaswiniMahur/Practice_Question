import java.util.Scanner;

public class oddevenforloop {
    public void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter start range;");
        int start = sc.nextInt();
        System.out.println("enter end range:");
        int end= sc.nextInt();


        for(int i=start;i<=end;i++){
            if(i%2==0){
            System.out.println("goodevening");
            }
            else{
                System.out.println("goodevening");
            }

        }

    }
    
}