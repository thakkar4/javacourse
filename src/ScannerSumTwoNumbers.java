import java.util.Scanner;

public class ScannerSumTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scan.nextInt();
        System.out.println(("Enter the Second number"));
        int number2 = scan.nextInt();
        scan.close();
        int sum = number1 + number2 ;
        System.out.println("sum of these numbers " + sum);

    }
}
