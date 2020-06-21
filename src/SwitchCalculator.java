import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {

        double num1, num2, operator;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = scan.nextDouble();
        System.out.println("Enter Second number");
        num2 = scan.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        operator = scan.next().charAt(0);
        scan.close();
        


    }
}
