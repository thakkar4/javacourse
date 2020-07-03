import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {

        double num1, num2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = scan.nextDouble();
        System.out.println("Enter Second number");
        num2 = scan.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);
        scan.close();

        double output = 0;
        switch (operator) {
            
            case '+':
                output = num1 + num2;
                break;
                
            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1/num2;
                
            default:
                System.out.println( "you have entered wrong operator");
                
        }
        System.out.println(num1+" "+operator+ " "+num2+": " +output);
    }
}