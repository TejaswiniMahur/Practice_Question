import java.util.Scanner;

class ArmstrongNum {

    public static void main(String[] args) {

        int Num, digit, Sum = 0,num, temp, totalNumberOfDigit;
        
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System. in );
        num = sc.nextInt();
        Num = num;
        temp = num;
        totalNumberOfDigit = 0;
        System.out.println(totalNumberOfDigit);
        while(temp!=0){
            temp /= 10;
            totalNumberOfDigit=  totalNumberOfDigit +1;
        }
        
        while (num!= 0)
        {
            digit = num % 10;
            Sum += Math.pow(digit, totalNumberOfDigit );
            num /= 10;
        }

        if(Sum == Num)
            System.out.println(Num+ " is an Armstrong number");
        else
            System.out.println(Num+ " is not an Armstrong number");
    }
}
    

