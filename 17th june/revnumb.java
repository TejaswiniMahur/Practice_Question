import java.util.Scanner;

public class revnumb {
    public static void main(String[] args) {
    int numb,temp,num,rev=0,rem;
    
    System.out.println("enter number:");
    Scanner sc = new Scanner(System.in);
    numb = sc.nextInt();
    num = numb;
    temp = num;

    while (temp!=0) {
        rem=temp%10;
        rev=rev*10 + rem;
        temp/=10; 
    }
    System.out.println("reversed number:"+rev);
        
    }        
}
