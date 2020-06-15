import java.util.Scanner;

public class InputPosOrNeg {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter any number");
        int number = scan.nextInt();
        scan.close();

        if(number > 0)  {
            System.out.println(number+ " is a positive number");
        }
        else if(number < 0) {
            System.out.println(number+ " is a negative number");
        }
        else {
            System.out.println(number+ " is neither negative or positive");
        }


    }
}
