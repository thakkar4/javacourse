import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any 10 numbers");
        int grade;
        int total = 0;
        int average;
        int counter =1;

     /*   for(counter=1; counter<=10; counter++){
            grade = scan.nextInt();
            total = total+grade;

        }
        average = total/10;
        System.out.println("The average is: " +average); */

        while (counter<10){
            grade = scan.nextInt();
            total = total+grade;
            counter++;
        }
        average = total/10;
        System.out.println("The average is: "+ average);
    }
}
