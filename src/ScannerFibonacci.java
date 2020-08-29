import java.util.Scanner;

public class ScannerFibonacci {

    public static void main(String[] args) {
        int count, num1 = 0, num2 = 1;
        System.out.println("How many numbers you want in the sequence");
        Scanner scan = new Scanner(System.in);
        count=scan.nextInt();
        scan.close();
        System.out.print("Fibonacci Series of "+count+" numbers: ");

        int i = 1;

        while(i<=count) {

            System.out.print(num1+ " ");

            int sum = num1+num2;
            num1=num2;
            num2=sum;

            i++;
        }
    }
}
