import java.util.*;

public class twoDarrayx{
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int coloums = sc.nextInt();
       System.out.println("enter rows");
       System.out.println("enter coloums");

       int [][] number = new int[rows][coloums];

       for(int i= 0; i<rows; i++){
        for(int j=0; j<coloums;j++){
            number [i][j]= sc.nextInt();

        }
       }
       int x= sc.nextInt();
       for(int i= 0; i<rows; i++){
        for(int j=0; j<coloums;j++){
           if(number[i][j]==x);
           System.out.println("index("+i+","+j+")");

        }
        System.out.println();
    } 
}
}
