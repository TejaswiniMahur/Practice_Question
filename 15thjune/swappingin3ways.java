

public class swappingin3ways {
    public static void main(String[] arg){
    int a= 10;
    int b = 20;

    System.out.println("before swapping" +a+" "+b);

    a=a+b;
    b=a-b;
    a=a-b;

    System.out.println("After swapping" +a+" "+b);
    
    a=a*b;
    b=a/b;
    a=a/b;

    System.out.println("After mul swapping" +a+" "+b);
    }
    
}

