import java.util.Scanner;

class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " goodevening");
        } else {
            System.out.println(number + " goodmorning");
        }
        
        scanner.close();
    }
}
